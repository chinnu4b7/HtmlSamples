$(document).ready(function() {
//	$('#xmlParseButton').on('click', function() {
//		$.parseXML('xml/sample.xml');
//	});
	$.ajax({
		url: 'xml/sample.xml',
		dataType: 'xml',
		success: function(data) {
			xml = data;
			//console.log('success'+$(xml).find('from').text());
			$(xml).find('Employee').each(function() {
				//console.log('Name = '+$(this).find('email').text());
				$('#list').append('<li><a>'+$(this).find('email').text()+'</a></li>').listview('refresh');
			});
		},
		error: function() {
			console.log('Error!');
		}
	});
//	var xmlData = $.parseXML('http://www.w3schools.com/xml/note.xml');
//	var from = $(xmlData).find('from');
//	console.log(from);
});