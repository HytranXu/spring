<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>长连接测试</title>
    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript">
        var count = 2;
        var cnt = 2;
        function longPolling(){
            console.log("call longPolling");
            $.getJSON('/xs/cometservlet', function(data){
                console.log(data.result);
               // $('#n1').html(data.result);
                if(3 >= count) {
                    longPolling();
                    count++;
                }
            });
        }

        function longPolling3(){
            console.log("call longPolling3");
            $.get('/bbs/testin.jsp', function(data){
                console.log(data);
            });
        }

        function longPolling2(){
            console.log("call longPolling2");
            $.get('/test.jsp', function(data){
               console.log(data);
               // $('#n2').html(data);
                if(3 >= cnt) {
                    longPolling2();
                    cnt++;
                }
            });
        }

        $(function(){
             longPolling();
            longPolling3();
            longPolling2();
        });
    </script>
</head>

<body>
<h1>长连接测试</h1>
<h2 id="n1"></h2>
<h2 id="n2"></h2>
</body>
</html>
