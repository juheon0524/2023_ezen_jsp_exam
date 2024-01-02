package com.sayan.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        PrintWriter out = response.getWriter();

        String savePath = "upload"; // 파일 업로드된 파일을 저장할 디렉토리
        int uploadFileSizeLimit = 5 * 1024 * 1024; // 5MB로 파일 크기 제한
        String encType = "UTF-8"; // 문자 인코딩 타입
        ServletContext context = getServletContext();
        String uploadFilePath = context.getRealPath(savePath); // 서버상의 실제 파일 저장 경로
        System.out.println("서버상의 실제 디렉토리 : ");
        System.out.println(uploadFilePath);

        try {
            MultipartRequest multi = new MultipartRequest(
                    request,
                    uploadFilePath, // 서버상 실제 파일 저장 경로
                    uploadFileSizeLimit, // 파일 크기 제한
                    encType, // 인코딩
                    new DefaultFileRenamePolicy()); // 파일명 중복 시 파일명에 번호를 추가하여 중복 방지

            // 서버에 저장된 파일명 (실제 파일 이름과 다를 수 있음)
            String fileName = multi.getFilesystemName("uploadFile");

            if (fileName == null) { // 파일 업로드 실패
                System.out.println("파일 업로드 실패!!!");
            } else { // 파일 업로드 성공
                out.println("<br> 작성자 : " + multi.getParameter("name"));
                out.println("<br> 제목 : " + multi.getParameter("title"));
                out.println("<br> 파일명 : " + fileName);
                out.println("<br> 실제 파일명 : " + multi.getOriginalFileName("uploadFile"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
