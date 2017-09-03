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

$('#modalEditarProduto').on('show.bs.modal', function(event) {
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

$('#modalEditarCliente').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var codigoJS = button.data('codigo');
	var tipoPessoaJS = button.data('tipopessoa');
	var descricaoJS = button.data('nome');
	var enderecoJS = button.data('endereco');
	var bairroJS = button.data('bairro');
	var cidadeJS = button.data('cidade');
	var ufJS = button.data('uf');
	var cepJS = button.data('cep');
	var emailJS = button.data('email');
	var telefone1JS = button.data('telefone1');
	var telefone2JS = button.data('telefone2');
	var cpfJS = button.data('cpf');
	var rgJS = button.data('rg');
	var profissaoJS = button.data('profissao');
	var dataNascimentoJS = button.data('datanascimento');
	var paiJS = button.data('pai');
	var maeJS = button.data('mae');
	var referencia1JS = button.data('referencia1');
	var referencia2JS = button.data('referencia2');
	var clienteAtivoJS = button.data('clienteativo');
	var dataCadastroJS = button.data('datacadastro');
	
	var modal = $(this);
	var form = modal.find('form');
	
	var codigo = document.getElementById('codigo');
	var tipoPessoa = document.getElementById('tipoPessoa');
	var descricao = document.getElementById('nome');
	var endereco = document.getElementById('endereco');
	var bairro = document.getElementById('bairro');
	var cidade = document.getElementById('cidade');
	var uf = document.getElementById('uf');
	var cep = document.getElementById('cep');
	var email = document.getElementById('email');
	var telefone1 = document.getElementById('telefone1');
	var telefone2 = document.getElementById('telefone2');
	var cpf = document.getElementById('cpf');
	var rg = document.getElementById('rg');
	var profissao = document.getElementById('profissao');
	var dataNascimento = document.getElementById('dataNascimento');
	var pai = document.getElementById('pai');
	var mae = document.getElementById('mae');
	var referencia1 = document.getElementById('referencia1');
	var referencia2 = document.getElementById('referencia2');
	var clienteAtivo = document.getElementById('clienteAtivo');
	var dataCadastro = document.getElementById('dataCadastro');
	
	
	
	codigo.value = codigoJS;
	tipoPessoa.value = tipoPessoaJS;
	descricao.value = descricaoJS;
	endereco.value = enderecoJS;
	bairro.value = bairroJS;
	cidade.value = cidadeJS;
	uf.value = ufJS;
	cep.value = cepJS;
	email.value = emailJS;
	telefone1.value = telefone1JS;
	telefone2.value = telefone2JS;
	cpf.value = cpfJS;
	rg.value = rgJS;
	profissao.value = profissaoJS;
	dataNascimento.value = dataNascimentoJS;
	pai.value = paiJS;
	mae.value = maeJS;
	referencia1.value = referencia1JS;
	referencia2.value = referencia2JS;
	clienteAtivo.value = clienteAtivoJS;
	dataCadastro.value = dataCadastroJS;
	

	
});

$('#modalEditarFornecedor').on('show.bs.modal', function(event) {
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

$('#modalEditarFuncionario').on('show.bs.modal', function(event) {
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

$('#modalEditarTransportadora').on('show.bs.modal', function(event) {
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