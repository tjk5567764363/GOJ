$(".problem-title").click(function() {
	var id = $("#contest-id").val();
	var pid = $(this).attr("data");
	
	$.get("/goj/contest/" + id + "/" + pid, null, function(resp) {
		$("#pid").val(resp.id);
		$("#p-title").text(resp.title);
		$("#p-description").text(resp.description);
		$("#p-input").text(resp.input);
		$("#p-output").text(resp.output);
		$("#p-sample_input").text(resp.sample_input);
		$("#p-sample_output").text(resp.sample_output);
		$("#p-source").text(resp.source);
		$("#p-manager").text(resp.manager);
		$("#p-form").attr("action","/goj/status/" + resp.id);
		
		$("#l-problem").click();
	});
});

$(".list-group-item").click(function() {
	$(".list-group-item").attr("class","list-group-item");
	$(this).attr("class","list-group-item active");
	
	var lid = $(this).attr("id");
	if (lid == "l-problem") {
		$(".content").attr("style","display:none;");
		$("#problem").attr("style","display:block;")
	}
});

$('.getcontest').click(function() {
	$('#contentpwd').val('');
	$('#f').attr('action','/goj/contest/' + $(this).attr('id'));
	$('#modal-password').modal('toggle');
});