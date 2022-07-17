
// make the navbaar sticky at top iss nothing but the add the class or remove the class on the basis of scrolling 
$(document).ready(function() {
	$(window).on("scroll", function() {
		var scroll = $(window).scrollTop();
		if (scroll >= 90) {
			$('.sticky').addClass("stickyAdd");
		} else {
			$('.sticky').removeClass("stickyAdd");
		}
	})

	//  This typed effect cause by using js library typed function 
	var typed = new Typed('.ketan-typed', {
		strings: ['Ketan Fulzele', ' <strong>Software Engineer</strong>', 'Work At Cognizant &#9829;'],
		typeSpeed: 100,
		backSpeed: 100,
		smartBackspace: true, // this is a default
		backSpeed: 100,
		loop: true,
		loopCount: Infinity,
		startDelay: 1000
	});
	var typed = new Typed('.ketan2-typed', {
		strings: ['<mark>India</mark>', '<mark>To all my friends</mark>'],
		typeSpeed: 100,
		backSpeed: 100,
		smartBackspace: true, // this is a default
		backSpeed: 100,
		loop: true,
		loopCount: Infinity,
		startDelay: 1000
	});

	// progress bar 

	// way point class uses when we want to load the animation or transition only when experience section is display on page 
	var waypoint = new Waypoint({
		element: document.getElementById('exp-id'),  // when exp-id section touches the navigation bar then handler function calls 
		handler: function(direction) {
			var p = document.querySelectorAll(".progress-bar");
			p[0].setAttribute("style", "width:60%; transition:1s all");
			p[1].setAttribute("style", "width:70%; transition:1.5s all");
			p[2].setAttribute("style", "width:50%; transition:1.7s all");
			p[3].setAttribute("style", "width:60%; transition:2s all");
			p[4].setAttribute("style", "width:40%; transition:1.9s all");
		},
		offset: '90%'  // if difference between nav and experience sec is 90% then in that case above functio will trigger 
	});


	//   setting up the owl crousel plugin
	// add some properties to owl caruosel 
	$(".owl-carousel").owlCarousel({
		loop: true,
		autoplay: true,
		autoplayTimeout: 4000,
		items: 1
	});


	var filtereizd = $('.filter-container').filterizr({
		animationduration: 0.5,
	});



	$('#submit').click(function() {


		var name = document.getElementById('name');  
		var email = document.getElementById('email');    
		var location = document.getElementById('location');  
		var textarea = document.getElementById('textarea');  
		var email_span = document.getElementById('email_span');            //$('#email_span');
		var name_span = document.getElementById('name_span');                //$('#name_span');

		if (name.value.length() == 0) {
			name.css(box - shadow, "5px 10px red");
			name_span.text("please enter your name!")
			return false;
		}
		if (email.value.length() == 0) {
			email_span.text("please enter your email!");
			return false;
		}
		else if (IsEmail(email_val) == true) {
			email.css(box - shadow, "5px 10px red");
			email_span.text("please enter your email!");
			return false;
		}
		name.value = '';
		email.value = '';
		location.value = '';
		textarea.value = '';
		return false ;
	});


});

function IsEmail(email) {
	var regex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!regex.test(email)) {
		return false;
	} else {
		return true;
	}
}


function changebg() {
	var btn = document.getElementsByClassName("feedback-btn");
	btn.style.background='#5e2e2e';
	return false ;
}