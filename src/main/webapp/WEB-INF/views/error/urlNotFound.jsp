<%@ page contentType="text/html;charset=UTF-8"%>
<script>
    if(confirm('${message}')){
        history.go(-1); // 이전 페이지로 이동
    }else{
        location.href = "/";
    }
</script>
<html>

</html>