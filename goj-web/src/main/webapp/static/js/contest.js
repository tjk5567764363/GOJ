$(".problem-title").click(function() {
	var pid = $(this).attr("data");
	getProblem(pid);
});

$(".p.list-group-item").click(function() {
	$(".p.list-group-item").attr("class","p list-group-item");
	$(this).attr("class","p list-group-item active");
	
	var lid = $(this).attr("id");
	if (lid == "l-problem") {
		$(".content").attr("style","display:none;");
		$("#problem").attr("style","display:block;");
		
		if ($("#pid").val() == "" || $("#pid").val() == null) {
			$(".problem-title")[0].click();
		}
	} else if (lid == "l-overview") {
		$(".content").attr("style","display:none;");
		$("#overview").attr("style","display:block;")
	} else if (lid = "l-status") {
		$(".content").attr("style","display:none;");
		$("#status").attr("style","display:block;")
	} else if (lid = "l-ranklist") {
		$(".content").attr("style","display:none;");
		$("#ranklist").attr("style","display:block;")
	}
});

$(".p-list.list-group-item").click(function() {
	$(".p-list.list-group-item").attr("class","p-list list-group-item");
	$(this).attr("class","p-list list-group-item active");
	
	var pid = $(this).attr("id").replace("list-group-", "");
	getProblem(pid);
});

$('.getcontest').click(function() {
	$('#contentpwd').val('');
	$('#f').attr('action','/goj/contest/' + $(this).attr('id'));
	$('#modal-password').modal('toggle');
});

function getProblem(pid) {
	var id = $("#contest-id").val();
	$.get("/goj/contest/" + id + "/" + pid, null, function(resp) {
		$("#pid").val(resp.id);
		$("#p-title").text(resp.title);
		$("#p-description").empty();
		$("#p-description").append(resp.description);
		$("#p-input").empty();
		$("#p-input").append(resp.input);
		$("#p-output").empty();
		$("#p-output").append(resp.output);
		$("#p-sample_input").empty();
		$("#p-sample_input").append(resp.sample_input);
		$("#p-sample_output").empty();
		$("#p-sample_output").append(resp.sample_output);
		$("#p-source").text(resp.source);
		$("#p-manager").text(resp.manager);
		$("#p-form").attr("action","/goj/status/" + resp.id);
		
		$(".p-list.list-group-item").attr("class", "p-list list-group-item");
		$("#list-group-" + resp.id).attr("class", "p-list list-group-item active");
		$("#l-problem").click();
	});
}