$('#exclusaoModal').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var codigoJS = button.data('codigo');
	var descricaoJS = button.data('descricao');
	
	var modal = $(this);
	var form = modal.find('form');
	var action = form.data('url-base');
	if (!action.endsWith('/')) {
		action += '/';
	}
	form.attr('action', action + codigoJS);
	
	modal.find('.modal-body span').html('Tem certeza que deseja excluir o <strong>' + descricaoJS + '</strong>?');
});

$('#modalEditarSetor').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var codigoJS = button.data('codigo');
	var descricaoJS = button.data('descricao');
	
	var modal = $(this);
	var form = modal.find('form');
	
	var codigo = document.getElementById('codigo');
	var descricao = document.getElementById('descricao');
	
	codigo.value = codigoJS;
	descricao.value = descricaoJS;

	
});


$('#modalEditarBanco').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var codigoJS = button.data('codigo');
	var descricaoJS = button.data('nome');
	
	var modal = $(this);
	var form = modal.find('form');
	
	var codigo = document.getElementById('codigo');
	var descricao = document.getElementById('nome');
	
	codigo.value = codigoJS;
	descricao.value = descricaoJS;

	
});


jQuery(document).ready(function(){
	$('[rel="tooltip"').tooltip();
});