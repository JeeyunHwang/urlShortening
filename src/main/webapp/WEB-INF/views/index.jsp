<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="ko">
    <head>
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    </head>
    <body>
        <div style="padding-top: 20px ;width: 300px; text-align: right">
            압축할 URL
            : <input type="text" id="originUrl" name="originUrl" value="" placeholder="압축할 URL을 입력하세요"/>
            <br/><p/>
            압축된 URL
            : <input type="text" id="shortenUrl" name="shortenUrl" value="" placeholder="" readonly/>
            <div style="padding-top: 20px ;width: 300px; text-align: right">
                <button type="button" id="submitBtn"  onclick="fnMakeShortenUrl()">생성하기</button>
                <button type="button" id="redirectBtn" onclick="fnRedirectToShortenUrl()" value="">이동하기</button>
            </div>
        </div>
    </body>
</html>


<script>

    function fnMakeShortenUrl(){
        let sendData = {
            originUrl : $("#originUrl").val()
        }

        $.ajax({
            url         : '/api/url',
            method      : 'POST',
            data        : JSON.stringify(sendData),
            contentType : 'application/json; charset=utf-8',
            success     : function (res) {
                $("#shortenUrl").val(res.shortenUrl);
            },
            error: function(resError) {
                alert(JSON.stringify(resError));
            }
        });
    }

    function fnRedirectToShortenUrl(){
        let shortenUrl = $("#shortenUrl").val();
        console.log("shortenUrl:" + shortenUrl);
        $.ajax({
            url         : '/redirect/' + shortenUrl,
            method      : 'GET',
            contentType : 'application/json; charset=utf-8',
            success     : function (res) {
                location = res;
            },
            error: function(resError) {
                alert(JSON.stringify(resError));
            }
        });
    }
</script>