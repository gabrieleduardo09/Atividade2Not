package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal {

	private JFrame frame;
	private JTable table;
	private FlowLayout fy;
	private JScrollPane sp;
	private DefaultTableModel model;
	private JButton bt;

	public TelaPrincipal() {
		frame = new JFrame();
		frame.setTitle("Ocorrências Policiais");
		this.dimencaoFrame();
		fy = new FlowLayout();
		frame.setLayout(fy);

		this.tableCidadao();
		this.tableOcorrencia();

		this.btNCidadao();
		this.btGCidadao();
		this.btNOcorrencia();
		this.btGOcorrencia();

	}

	private void dimencaoFrame() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		int frameWidth = 1000;
		int frameHeight = 520;
		frame.setSize(frameWidth, frameHeight);
		int locationX = (int) (width - frameWidth) / 2;
		int locationY = (int) (height - frameHeight) / 2;
		frame.setLocation(locationX, locationY);
		frame.setResizable(false); // TRAVA O TAMANHO DO FRAME
	}

	private void tableCidadao() {
		String[] colunasCidadao = { "ID", "NOME", "Nº DOC.", "ENDEREÇO", "TELEFONE", "E-MAIL" };
		Object[][] linhasDeDadosCidadao = {
				{ "1", "Gabriel", "83728374911", "Hidalgo Junior", "48998256472", "gabriel@gamil.com" },
				{ "2", "Eduardo", "98728374922", "Julio da Luz", "48988256489", "eduardo@gamil.com" } };
		model = new DefaultTableModel(linhasDeDadosCidadao, colunasCidadao);
		table = new JTable(model);
		table.getTableHeader().setReorderingAllowed(false); // TRAVA AS COLUNAS
		sp = new JScrollPane(table);
		frame.add(sp);
	}

	private void tableOcorrencia() {
		String[] colunasOcorrencia = { "ID", "DATA", "DESCRIÇÃO", "LOCAL", "CIDADÃO" };
		Object[][] linhasDeDadosOcorrencia = { { "1", "18/05/2022", "Roubo", "Rosa Maria Oliveira", "2" } };
		model = new DefaultTableModel(linhasDeDadosOcorrencia, colunasOcorrencia);
		table = new JTable(model);
		table.getTableHeader().setReorderingAllowed(false); // TRAVA AS COLUNAS
		sp = new JScrollPane(table);
		frame.add(sp);
	}

	private void btNCidadao() {
		bt = new JButton("Novo Cidadão");
		bt.setPreferredSize(new Dimension(150, 20));
		frame.add(bt);
	}

	private void btGCidadao() {
		bt = new JButton("Gravar Alterações");
		bt.setPreferredSize(new Dimension(150, 20));
		frame.add(bt);
	}

	private void btNOcorrencia() {
		bt = new JButton("Nova Ocorrência");
		bt.setPreferredSize(new Dimension(150, 20));
		frame.add(bt);
	}

	private void btGOcorrencia() {
		bt = new JButton("Gravar Alterações");
		bt.setPreferredSize(new Dimension(150, 20));
		frame.add(bt);
	}

	public void exibirTela() {
		frame.setVisible(true);
	}

}
