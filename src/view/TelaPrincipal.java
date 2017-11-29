package view;

import controller.ControladorPrincipal;
import lixo.TelaCadastro;
import lixo.TelaListar;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame{
	
	//1 passo - declarar os componentes visuais
	private TelaCadastro telaCadastro;
	private TelaListar telaListar;
	private JPanel painelPrincipal;
	private static TelaPrincipal instance;


	private ControladorPrincipal controladorPrincipal;

	private CadastrarCliente cliente;
	private CadastrarEvento evento;
	private VenderIngresso venderIngresso;
	private IngressosVendidos ingressosVendidos;

	public CadastrarCliente getCadastrarCliente() {
		return cliente;
	}

	public CadastrarEvento getEvento() {
		return evento;
	}

	private JMenuBar menuBar;
	private JMenu menuAbrir;
	private JMenuItem menuFechar;
	private JMenu historico;
	
	public static final TelaPrincipal getInstance()
	{
		return instance;
	}

	public TelaCadastro getTelaCadastro() {
		return telaCadastro;
	}

	public void setTelaCadastro(TelaCadastro telaCadastro) {
		this.telaCadastro = telaCadastro;
	}

	public TelaListar getTelaListar() {
		return telaListar;
	}

	public void setTelaListar(TelaListar telaListar) {
		this.telaListar = telaListar;
	}

	public JPanel getPainelPrincipal() {
		return painelPrincipal;
	}

	public void setPainelPrincipal(JPanel painelPrincipal) {
		this.painelPrincipal = painelPrincipal;
	}

	public static void setInstance(TelaPrincipal instance) {
		TelaPrincipal.instance = instance;
	}

	public CadastrarCliente getCliente() {
		return cliente;
	}

	public void setCliente(CadastrarCliente cliente) {
		this.cliente = cliente;
	}

	public void setEvento(CadastrarEvento evento) {
		this.evento = evento;
	}

	public void setVenderIngresso(VenderIngresso venderIngresso) {
		this.venderIngresso = venderIngresso;
	}


	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMenuAbrir() {
		return menuAbrir;
	}

	public void setMenuAbrir(JMenu menuAbrir) {
		this.menuAbrir = menuAbrir;
	}

	public JMenuItem getMenuFechar() {
		return menuFechar;
	}

	public void setMenuFechar(JMenuItem menuFechar) {
		this.menuFechar = menuFechar;
	}

	public JMenu getHistorico() {
		return historico;
	}

	public void setHistorico(JMenu historico) {
		this.historico = historico;
	}

	public ControladorPrincipal getControladorPrincipal() {
		return controladorPrincipal;
	}

	public void setControladorPrincipal(ControladorPrincipal controladorPrincipal) {
		this.controladorPrincipal = controladorPrincipal;
	}

	//2  passo - criar o método construtor
	public TelaPrincipal(String titulo, ControladorPrincipal controladorPrincipal)
	{

		super(titulo);	
		instance = this;
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Erro");
		}


		this.controladorPrincipal = controladorPrincipal;


		//aula passada


//		menuBar = new JMenuBar();
//		setJMenuBar(menuBar);
//		menuAbrir = new JMenu("Abrir");
//		menuFechar= new JMenu("Fechar");
//		menuBar.add(menuAbrir);
//		menuAbrir.add(menuFechar);


		//3 passo - instanciar cada componente visual
		painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());		
		telaCadastro = new TelaCadastro(Color.GRAY.brighter(),instance);


		Login login = new Login(Color.GRAY.brighter(),instance);

		venderIngresso = new VenderIngresso(Color.GRAY.brighter(),instance);
		evento = new CadastrarEvento(Color.GRAY.brighter(), instance);
		ingressosVendidos = new IngressosVendidos(Color.GRAY.brighter(),instance);
		telaListar = new TelaListar(Color.GRAY.brighter(),instance);
	    //5 passo - adicionar os componentes ao container		
		setLayout(new BorderLayout());


//		add(painelPrincipal, BorderLayout.CENTER);//adicionei ao JFrame
//		painelPrincipal.add(telaCadastro); //adicionei a telaCadastro ao painelPrincipal
//		painelPrincipal.setPreferredSize(telaCadastro.getPreferredSize());

		add(painelPrincipal, BorderLayout.CENTER);//adicionei ao JFrame
		painelPrincipal.add(login); //adicionei a telaCadastro ao painelPrincipal
		painelPrincipal.setPreferredSize(login.getPreferredSize());




		//6 passo - setar as configuracoes da janela		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ira encerrar
		setPreferredSize(new Dimension(950, 670));
		setSize(getPreferredSize());
		setVisible(true);//visivel
		pack();
		setLocationRelativeTo(null);//ao centro da tela
		//7 passo  - tratar o evento do botao
		
	}
	public void telaListar()
	{
		painelPrincipal.removeAll();
		painelPrincipal.add( telaListar,BorderLayout.CENTER );
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		/*getContentPane().removeAll();
	    getContentPane().add( telaListar,BorderLayout.CENTER );
	    revalidate();
	    repaint();*/
	}
	public void telaCadastro()
	{
		painelPrincipal.removeAll();
		painelPrincipal.add( telaCadastro,BorderLayout.CENTER );
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		/*getContentPane().removeAll();
	    getContentPane().add( telaCadastro ,BorderLayout.CENTER);
	    revalidate();
	    repaint();*/
	 }
	public void cadastrarCliente()
	{
		painelPrincipal.removeAll();
		painelPrincipal.add(cliente = new CadastrarCliente(Color.GRAY.brighter(), instance),BorderLayout.CENTER );
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		/*getContentPane().removeAll();
	    getContentPane().add( telaCadastro ,BorderLayout.CENTER);
	    revalidate();
	    repaint();*/
	}
	public void telaBase()
	{
		painelPrincipal.removeAll();
		painelPrincipal.add( new TelaBase(Color.GRAY.brighter(), instance),BorderLayout.CENTER );
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		/*getContentPane().removeAll();
	    getContentPane().add( telaCadastro ,BorderLayout.CENTER);
	    revalidate();
	    repaint();*/
	}
	public void cadastrarEvento()
	{
		painelPrincipal.removeAll();
		painelPrincipal.add(evento,BorderLayout.CENTER );
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		/*getContentPane().removeAll();
	    getContentPane().add( telaCadastro ,BorderLayout.CENTER);
	    revalidate();
	    repaint();*/
	}

	public IngressosVendidos getIngressosVendidos() {
		return ingressosVendidos;
	}

	public void setIngressosVendidos(IngressosVendidos ingressosVendidos) {
		this.ingressosVendidos = ingressosVendidos;
	}

	public void ingressosVendidos()
	{
		painelPrincipal.removeAll();
		painelPrincipal.add( ingressosVendidos,BorderLayout.CENTER );
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		/*getContentPane().removeAll();
	    getContentPane().add( telaCadastro ,BorderLayout.CENTER);
	    revalidate();
	    repaint();*/
	}
	public void venderIngresso()
	{
		painelPrincipal.removeAll();
		painelPrincipal.add( venderIngresso,BorderLayout.CENTER );
		painelPrincipal.revalidate();
		painelPrincipal.repaint();
		/*getContentPane().removeAll();
	    getContentPane().add( telaCadastro ,BorderLayout.CENTER);
	    revalidate();
	    repaint();*/
	}


//	 public void addMenuBar(){
//		 menuBar = new JMenuBar();
//		 setJMenuBar(menuBar);
//		 menuAbrir = new JMenu("Eventos");
//		 menuBar.add(menuAbrir);
//
//	 }
//	 public void attMenuBar(){
//
//		 JMenu menuEvento = new JMenu(controladorPrincipal.getEventos().get(controladorPrincipal.getEventos().size()-1).getNome());
//		 menuBar.add(menuEvento);
//
//	 }
	 public void attIngressosVendidos(){
	 	painelPrincipal.removeAll();
	 	ingressosVendidos = new IngressosVendidos(Color.GRAY.brighter(),instance);
	 	painelPrincipal.add(ingressosVendidos, BorderLayout.CENTER);
	 	painelPrincipal.revalidate();
	 	painelPrincipal.repaint();
	 }

	 public VenderIngresso getVenderIngresso(){
	 	return venderIngresso;
	 }



}
