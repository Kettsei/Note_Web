<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> Account </title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mihstore Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>
<!--//fonts-->
<!--//slider-script-->
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close2').on('click', function(c){
		$('.message2').fadeOut('slow', function(c){
	  		$('.message2').remove();
		});
	});	  
});
</script>
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
				</script>
				<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>		
</head>
<body> 
<!--header-->
	<div class="container">
	<!-- header-top --> 
	<jsp:include page="header/header-top1.jsp"></jsp:include>
	<!-- header-top --> 
	
	<!-- header-bottom --> 
	<jsp:include page="header/header-bot1.jsp"></jsp:include>	
	<!-- header-bottom --> 
		<div class="page">
			<h6><a href="#">Page Title</a><b>|</b>Page description The quick, brown <span class="for">fox jumps over a lazy dog. DJs flock by when TV ax quiz prog.</span></h6>
		</div>
		<div class="content">
		<div class="account-in">
							<h2>Account</h2>
							<div class="col-md-7 account-top">
								<form action="Login?action=Login" method="post">
									<div> 	
										<span>Username*</span>
										<input type="text" name="username"> 
									</div>
									<div> 
										<span  class="pass">Password*</span>
										<input type="password" name="password">
									</div>				
										<input type="submit" value="Login"> 
								</form>
							</div>
							<div class="col-md-5 left-account ">
								<a href="single.jsp"><img class="img-responsive " src="images/ac.jpg" alt=""></a>
								<div class="five-in">
								<h1>25% </h1><span>discount</span>
								</div>
								<a href="register.jsp" class="create">Create an account</a>
								<div class="clearfix"> </div>
							</div>
						<div class="clearfix"> </div>
					</div>	


	
		</div>
		<!---->
		<div class="footer">
			<p class="footer-class">© 2015 Mihstore All Rights Reserved | Template by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
			
				<a href="#home" class="scroll to-Top" >  GO TO TOP!</a>
		<div class="clearfix"> </div>
		</div>
	</div>

	<!---->
</body>
</html>