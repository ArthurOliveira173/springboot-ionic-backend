package com.nelioalves.cursomc.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.domain.Cidade;
import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.domain.Endereco;
import com.nelioalves.cursomc.domain.Estado;
import com.nelioalves.cursomc.domain.ItemPedido;
import com.nelioalves.cursomc.domain.Pagamento;
import com.nelioalves.cursomc.domain.PagamentoComBoleto;
import com.nelioalves.cursomc.domain.PagamentoComCartao;
import com.nelioalves.cursomc.domain.Pedido;
import com.nelioalves.cursomc.domain.Produto;
import com.nelioalves.cursomc.domain.enums.EstadoPagamento;
import com.nelioalves.cursomc.domain.enums.Perfil;
import com.nelioalves.cursomc.domain.enums.TipoCliente;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.repositories.CidadeRepository;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.repositories.EnderecoRepository;
import com.nelioalves.cursomc.repositories.EstadoRepository;
import com.nelioalves.cursomc.repositories.ItemPedidoRepository;
import com.nelioalves.cursomc.repositories.PagamentoRepository;
import com.nelioalves.cursomc.repositories.PedidoRepository;
import com.nelioalves.cursomc.repositories.ProdutoRepository;

@Service
public class DBService {

	@Autowired
	private BCryptPasswordEncoder pe;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public void instantiateTestDatabase() throws ParseException {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Cama mesa e banho");
		Categoria cat4 = new Categoria(null, "Eletrônicos");
		Categoria cat5 = new Categoria(null, "Jardinagem");
		Categoria cat6 = new Categoria(null, "Decoração");
		Categoria cat7 = new Categoria(null, "Perfumaria");

		Produto pro1 = new Produto(null, "Computador", 2000.00);
		Produto pro2 = new Produto(null, "Impressora", 800.00);
		Produto pro3 = new Produto(null, "Mouse", 80.00);
		Produto pro4 = new Produto(null, "Mesa de escritório", 300.00);
		Produto pro5 = new Produto(null, "Toalha", 50.00);
		Produto pro6 = new Produto(null, "Colcha", 200.00);
		Produto pro7 = new Produto(null, "TV true color", 1200.00);
		Produto pro8 = new Produto(null, "Roçadeira", 800.00);
		Produto pro9 = new Produto(null, "Abajour", 100.00);
		Produto pro10 = new Produto(null, "Pendente", 180.00);
		Produto pro11 = new Produto(null, "Perfume", 90.00);
		
		Produto pro12 = new Produto(null, "Produto 12", 10.00);
		Produto pro13 = new Produto(null, "Produto 13", 10.00);
		Produto pro14 = new Produto(null, "Produto 14", 10.00);
		Produto pro15 = new Produto(null, "Produto 15", 10.00);
		Produto pro16 = new Produto(null, "Produto 16", 10.00);
		Produto pro17 = new Produto(null, "Produto 17", 10.00);
		Produto pro18 = new Produto(null, "Produto 18", 10.00);
		Produto pro19 = new Produto(null, "Produto 19", 10.00);
		Produto pro20 = new Produto(null, "Produto 20", 10.00);
		Produto pro21 = new Produto(null, "Produto 21", 10.00);
		Produto pro22 = new Produto(null, "Produto 22", 10.00);
		Produto pro23 = new Produto(null, "Produto 23", 10.00);
		Produto pro24 = new Produto(null, "Produto 24", 10.00);
		Produto pro25 = new Produto(null, "Produto 25", 10.00);
		Produto pro26 = new Produto(null, "Produto 26", 10.00);
		Produto pro27 = new Produto(null, "Produto 27", 10.00);
		Produto pro28 = new Produto(null, "Produto 28", 10.00);
		Produto pro29 = new Produto(null, "Produto 29", 10.00);
		Produto pro30 = new Produto(null, "Produto 30", 10.00);
		Produto pro31 = new Produto(null, "Produto 31", 10.00);
		Produto pro32 = new Produto(null, "Produto 32", 10.00);
		Produto pro33 = new Produto(null, "Produto 33", 10.00);
		Produto pro34 = new Produto(null, "Produto 34", 10.00);
		Produto pro35 = new Produto(null, "Produto 35", 10.00);
		Produto pro36 = new Produto(null, "Produto 36", 10.00);
		Produto pro37 = new Produto(null, "Produto 37", 10.00);
		Produto pro38 = new Produto(null, "Produto 38", 10.00);
		Produto pro39 = new Produto(null, "Produto 39", 10.00);
		Produto pro40 = new Produto(null, "Produto 40", 10.00);
		Produto pro41 = new Produto(null, "Produto 41", 10.00);
		Produto pro42 = new Produto(null, "Produto 42", 10.00);
		Produto pro43 = new Produto(null, "Produto 43", 10.00);
		Produto pro44 = new Produto(null, "Produto 44", 10.00);
		Produto pro45 = new Produto(null, "Produto 45", 10.00);
		Produto pro46 = new Produto(null, "Produto 46", 10.00);
		Produto pro47 = new Produto(null, "Produto 47", 10.00);
		Produto pro48 = new Produto(null, "Produto 48", 10.00);
		Produto pro49 = new Produto(null, "Produto 49", 10.00);
		Produto pro50 = new Produto(null, "Produto 50", 10.00);

		cat1.getProdutos().addAll(Arrays.asList(pro12, pro13, pro14, pro15, pro16, pro17, pro18,
		pro19, pro20, pro21, pro22, pro23, pro24, pro25, pro26, pro27, pro28, pro29, pro30, pro31,
		pro32, pro34, pro35, pro36, pro37, pro38, pro39, pro40, pro41, pro42, pro43, pro44, pro45,
		pro46, pro47, pro48, pro49, pro50));

		pro12.getCategorias().add(cat1);
		pro13.getCategorias().add(cat1);
		pro14.getCategorias().add(cat1);
		pro15.getCategorias().add(cat1);
		pro16.getCategorias().add(cat1);
		pro17.getCategorias().add(cat1);
		pro18.getCategorias().add(cat1);
		pro19.getCategorias().add(cat1);
		pro20.getCategorias().add(cat1);
		pro21.getCategorias().add(cat1);
		pro22.getCategorias().add(cat1);
		pro23.getCategorias().add(cat1);
		pro24.getCategorias().add(cat1);
		pro25.getCategorias().add(cat1);
		pro26.getCategorias().add(cat1);
		pro27.getCategorias().add(cat1);
		pro28.getCategorias().add(cat1);
		pro29.getCategorias().add(cat1);
		pro30.getCategorias().add(cat1);
		pro31.getCategorias().add(cat1);
		pro32.getCategorias().add(cat1);
		pro33.getCategorias().add(cat1);
		pro34.getCategorias().add(cat1);
		pro35.getCategorias().add(cat1);
		pro36.getCategorias().add(cat1);
		pro37.getCategorias().add(cat1);
		pro38.getCategorias().add(cat1);
		pro39.getCategorias().add(cat1);
		pro40.getCategorias().add(cat1);
		pro41.getCategorias().add(cat1);
		pro42.getCategorias().add(cat1);
		pro43.getCategorias().add(cat1);
		pro44.getCategorias().add(cat1);
		pro45.getCategorias().add(cat1);
		pro46.getCategorias().add(cat1);
		pro47.getCategorias().add(cat1);
		pro48.getCategorias().add(cat1);
		pro49.getCategorias().add(cat1);
		pro50.getCategorias().add(cat1);

		cat1.getProdutos().addAll(Arrays.asList(pro1, pro2, pro3));
		cat2.getProdutos().addAll(Arrays.asList(pro2, pro4));
		cat3.getProdutos().addAll(Arrays.asList(pro5, pro6));
		cat4.getProdutos().addAll(Arrays.asList(pro1, pro2, pro3, pro7));
		cat5.getProdutos().addAll(Arrays.asList(pro8));
		cat6.getProdutos().addAll(Arrays.asList(pro9, pro10));
		cat7.getProdutos().addAll(Arrays.asList(pro11));

		pro1.getCategorias().addAll(Arrays.asList(cat1, cat4));
		pro2.getCategorias().addAll(Arrays.asList(cat1, cat2, cat4));
		pro3.getCategorias().addAll(Arrays.asList(cat1, cat4));
		pro4.getCategorias().addAll(Arrays.asList(cat2));
		pro5.getCategorias().addAll(Arrays.asList(cat3));
		pro6.getCategorias().addAll(Arrays.asList(cat3));
		pro7.getCategorias().addAll(Arrays.asList(cat4));
		pro8.getCategorias().addAll(Arrays.asList(cat5));
		pro9.getCategorias().addAll(Arrays.asList(cat6));
		pro10.getCategorias().addAll(Arrays.asList(cat6));
		pro11.getCategorias().addAll(Arrays.asList(cat7));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		produtoRepository.saveAll(Arrays.asList(pro1, pro2, pro3, pro4, pro5, pro6, pro7, pro8, pro9, pro10, pro11));
		
		produtoRepository.saveAll(Arrays.asList(pro12, pro13, pro14, pro15, pro16, pro17, pro18,
		pro19, pro20, pro21, pro22, pro23, pro24, pro25, pro26, pro27, pro28, pro29, pro30, pro31,
		pro32, pro33, pro34, pro35, pro36, pro37, pro38, pro39, pro40, pro41, pro42, pro43, pro44,
		pro45, pro46, pro47, pro48, pro49, pro50));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade cid1 = new Cidade(null, "Uberlândia", est1);
		Cidade cid2 = new Cidade(null, "São Paulo", est2);
		Cidade cid3 = new Cidade(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2, cid3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));

		Cliente cli1 = new Cliente(null, "Maria Silva", "nelio.cursos@gmail.com", "36378912377", TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		
		Cliente cli2 = new Cliente(null, "Arthur Costa", "arthuremailteste@gmail.com", "31628382740", TipoCliente.PESSOAFISICA, pe.encode("123"));
		cli2.getTelefones().addAll(Arrays.asList("93883321", "34252625"));
		cli2.addPerfil(Perfil.ADMIN);

		Endereco end1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, cid1);
		Endereco end2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "98777012", cli1, cid2);
		Endereco end3 = new Endereco(null, "Avenida Floriano", "2106", null, "Centro", "281777012", cli2, cid2);

		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
		cli2.getEnderecos().addAll(Arrays.asList(end3));

		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(end1, end2, end3));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, end1);
		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1, end2);

		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		ped2.setPagamento(pagto2);

		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));

		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));

		ItemPedido ip1 = new ItemPedido(ped1, pro1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, pro3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, pro2, 100.00, 1, 800.00);

		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));

		pro1.getItens().addAll(Arrays.asList(ip1));
		pro2.getItens().addAll(Arrays.asList(ip3));
		pro3.getItens().addAll(Arrays.asList(ip2));

		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
	}
}
