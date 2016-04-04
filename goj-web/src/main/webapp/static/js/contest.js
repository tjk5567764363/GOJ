$(".problem-title").click(function() {
	var id = $("#contest-id").val();
	var pid = $(this).attr("data");
	
	$.get("/goj/contest/" + id + "/" + pid, null, function(resp) {
		alert(resp);
	});
});

$('.getcontest').click(function() {
	$('#contentpwd').val('');
	$('#f').attr('action','/goj/contest/' + $(this).attr('id'));
	$('#modal-password').modal('toggle');
});