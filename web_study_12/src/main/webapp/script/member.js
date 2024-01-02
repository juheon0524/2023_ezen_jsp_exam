function memberCheck(){
    if(document.frm.cutno.value.length == 0){
        alert("회원번호를 입력해주세요.")
		document.frm.cutno.focus();
        return false;
    }
    if(document.frm.custname.value.length == 0){
        alert("회원이름을 입력해주세요.")
        document.frm.custname.focus();
        return false;
    }
    if(document.frm.grade.value.length == 0){
        alert("고객등급을 입력해주세요.")
        document.frm.grade.focus();
        return false;
    }
    return true;
}

function open_win(url, name){
   window.open(url,name,"width=500px, height=200px");
}

function passCheck(){
    if(document.frm.pass.value.length==0){
        alert("비밀번호를 입력하세요.")
        return false;
    }
    return true;
}