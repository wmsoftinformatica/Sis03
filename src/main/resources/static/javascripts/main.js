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
	var setorJS = button.data('setor');
	var fornecedorJS = button.data('fornecedor');
	var fabricanteJS = button.data('fabricante');
	var unJS = button.data('un');
	var precoCustoJS = button.data('precocusto');
	var precoVendaJS = button.data('precovenda');
	var qtdJS = button.data('qtd');
	var qtdMinimaJS = button.data('qtdminima');
	var cstJS = button.data('cst');
	var aliquotaIpiJS = button.data('aliquotaipi');
	var codigoIpiJS = button.data('codigoipi');
	var pesoBrutoJS = button.data('pesobruto');
	var pesoLiquidoJS = button.data('pesoliquido');
	var icmsJS = button.data('icms');
	var issJS = button.data('iss');
	var simplesJS = button.data('simples');
	var complementoPorcentagemJS = button.data('complementoporcentagem');
	var complemento1JS = button.data('complemento1');
	var complemento2JS = button.data('complemento2');
	var dataCadastroJS = button.data('datacadastro');
	var imprimirJS = button.data('imprimir');
	var complementoJS = button.data('complemento');
	var lucroJS = button.data('lucro');
	
	var modal = $(this);
	var form = modal.find('form');
	
	var codigo = document.getElementById('codigo');
	var descricao = document.getElementById('descricao');
	var setor = document.getElementById('setor');
	var fornecedor = document.getElementById('fornecedor');
	var fabricante = document.getElementById('fabricante');
	var un = document.getElementById('un');
	var precoCusto = document.getElementById('precoCusto');
	var precoVenda = document.getElementById('precoVenda');
	var qtd = document.getElementById('qtd');
	var qtdMinima = document.getElementById('qtdMinima');
	var cst = document.getElementById('cst');
	var aliquotaIpi = document.getElementById('aliquotaIpi');
	var codigoIpi = document.getElementById('codigoIpi');
	var pesoBruto = document.getElementById('pesoBruto');
	var pesoLiquido = document.getElementById('pesoLiquido');
	var icms = document.getElementById('icms');
	var iss = document.getElementById('iss');
	var simples = document.getElementById('simples');
	var complementoPorcentagem = document.getElementById('complementoPorcentagem');
	var complemento1 = document.getElementById('complemento1');
	var complemento2 = document.getElementById('complemento2');
	var dataCadastro = document.getElementById('dataCadastro');
	var imprimir = document.getElementById('imprimir');
	var complemento = document.getElementById('complemento');
	var lucro = document.getElementById('lucro');
	
	codigo.value = codigoJS;
	descricao.value = descricaoJS;
	setor.value = setorJS;
	fornecedor.value = fornecedorJS;
	fabricante.value = fabricanteJS;
	un.value = unJS;
	precoCusto.value = precoCustoJS;
	precoVenda.value = precoVendaJS;
	qtd.value = qtdJS;
	qtdMinima.value = qtdMinimaJS;
	cst.value = cstJS;
	aliquotaIpi.value = aliquotaIpiJS;
	codigoIpi.value = codigoIpiJS;
	pesoBruto.value = pesoBrutoJS;
	pesoLiquido.value = pesoLiquidoJS;
	icms.value = icmsJS;
	iss.value = issJS;
	simples.value = simplesJS;
	complementoPorcentagem.value = complementoPorcentagemJS;
	complemento1.value = complemento1JS;
	complemento2.value = complemento2JS;
	dataCadastro.value = dataCadastroJS;
	imprimir.value = imprimirJS;
	complemento.value = complementoJS;
	lucro.value = lucroJS;
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
	dataCadastro.value = dataCadastroJS;
	

	
});

$('#modalEditarFornecedor').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var codigoJS = button.data('codigo');
	var descricaoJS = button.data('nome');
	var contatoJS = button.data('contato');
	var enderecoJS = button.data('endereco');
	var cidadeJS = button.data('cidade');
	var bairroJS = button.data('bairro');
	var ufJS = button.data('uf');
	var cepJS = button.data('cep');
	var telefone1JS = button.data('telefone1');
	var telefone2JS = button.data('telefone2');
	var emailJS = button.data('email');
	var cnpjJS = button.data('cnpj');
	var ieJS = button.data('ie');
	var bancoJS = button.data('banco');
	var agenciaJS = button.data('agencia');
	var contaJS = button.data('conta');
	var clienteAtivoJS = button.data('clienteativo');
	var dataCadastroJS = button.data('datacadastro');
	
	var modal = $(this);
	var form = modal.find('form');
	
	var codigo = document.getElementById('codigo');
	var descricao = document.getElementById('nome');
	var contato = document.getElementById('contato');
	var endereco = document.getElementById('endereco');
	var bairro = document.getElementById('bairro');
	var cidade = document.getElementById('cidade');
	var uf = document.getElementById('uf');
	var uf = document.getElementById('uf');
	var cep = document.getElementById('cep');
	var telefone1 = document.getElementById('telefone1');
	var telefone2 = document.getElementById('telefone2');
	var email = document.getElementById('email');
	var cnpj = document.getElementById('cnpj');
	var ie = document.getElementById('ie');
	var banco = document.getElementById('banco');
	var agencia = document.getElementById('agencia');
	var conta = document.getElementById('conta');
	var clienteAtivo = document.getElementById('clienteAtivo');
	var dataCadastro = document.getElementById('dataCadastro');
	
	codigo.value = codigoJS;
	descricao.value = descricaoJS;
	contato.value = contatoJS;
	endereco.value = enderecoJS;
	bairro.value = bairroJS;
	cidade.value = cidadeJS;
	uf.value = ufJS;
	cep.value = cepJS;
	telefone1.value = telefone1JS;
	telefone2.value = telefone2JS;
	email.value = emailJS;
	cnpj.value = cnpjJS;
	ie.value = ieJS;
	banco.value = bancoJS;
	agencia.value = agenciaJS;
	conta.value = contaJS;
	clienteAtivo.value = clienteAtivoJS;
	dataCadastro.value = dataCadastroJS;
	

	
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