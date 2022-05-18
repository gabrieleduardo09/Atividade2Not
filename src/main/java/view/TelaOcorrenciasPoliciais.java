package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.vo.CidadaoVO;

public class TelaOcorrenciasPoliciais {

	private JFrame frame;
	private FlowLayout flCidadao, flOcorrencia;
	private JButton btI, btS, btE, btA;
	private JTable tableCidadao, tableOcorrencia;
	private JScrollPane scroll1, scroll2;

	public void apresentarTelaOcorrenciasPoliciais(CidadaoVO cidadaoVO) {
		//System.out.println("Executando...");
		frame = new JFrame();
		frame.setLocation(150, 150);
		frame.setTitle("Registro de Ocorrências Policiais");
		frame.setSize(950, 500); //1400, 700]
		//frame.setSize(1000, 1000);
		frame.setResizable(false); // Trava o tamanho do JFrame
		flCidadao = new FlowLayout(); //FlowLayout.LEADING, FlowLayout.CENTER, ou FlowLayout.TRAILING.
		frame.setLayout(flCidadao);
		
		//String[] table = {"CIDADÃO"};
		String[] colunasCidadao = {"ID", "NOME", "Nº DOC.", "ENDEREÇO", "TELEFONE", "E-MAIL"};
		Object[][] linhasDeDadosCidadao = {{"1", "Gabriel", "83728374911", "Hidalgo Junior", "48998256472", "gabriel@gamil.com"},
				{"2", "Eduardo", "98728374922", "Julio da Luz", "48988256489", "eduardo@gamil.com"}};
		
		DefaultTableModel model1 = new DefaultTableModel(linhasDeDadosCidadao, colunasCidadao);
		tableCidadao = new JTable(model1); //tableCidadao.moveColumn(tableCidadao.getColumnCount()-1, 0);
		
		tableCidadao.getTableHeader().setReorderingAllowed(false); //Trava a JTable
		
		tableCidadao.getColumnModel().getColumn(0).setPreferredWidth(30); //Tamanho da coluna
//		tableCidadao.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent evt) {
//				int row= tableCidadao.rowAtPoint(evt.getPoint());
//				int col= tableCidadao.columnAtPoint(evt.getPoint());
//				if(row>= 0&& col>= 0) { 
//					System.out.println("Clickedcellon("+ row+ ","+ col+ "): " + tableCidadao.getValueAt(row, col));
//					}
//				}
//			});
		
		tableCidadao.setPreferredSize(new Dimension(200, 400));
		scroll1 = new JScrollPane(tableCidadao);
		frame.add(scroll1);
		
		btS = new JButton("Salvar dados");
		btS.setPreferredSize(new Dimension(130, 20));
		
		btI = new JButton("Inserir linha");
		btI.setPreferredSize(new Dimension(130, 20));
		
		btE = new JButton("Excluir");
		btE.setPreferredSize(new Dimension(130, 20));
		
		btA = new JButton("Atualizar Dados");
		btA.setPreferredSize(new Dimension(130, 20));	
		
		
//		frame.add(btS);
//		frame.add(btI);
//		frame.add(btE);
//		frame.add(btA);
		
		//public String getText()
		
		
		flOcorrencia = new FlowLayout(); //FlowLayout.LEADING, FlowLayout.CENTER, ou FlowLayout.TRAILING.
		frame.setLayout(flOcorrencia);
		
		String[] colunasOcorrencia = {"ID", "DATA", "DESCRIÇÃO", "LOCAL", "CIDADÃO"};
		Object[][] linhasDeDadosOcorrencia = {{"1", "18/05/2022", "Roubo", "Rosa Maria Oliveira", "2"}};
		
		DefaultTableModel model2 = new DefaultTableModel(linhasDeDadosOcorrencia, colunasOcorrencia);
		tableOcorrencia = new JTable(model2);
		
		tableOcorrencia.getTableHeader().setReorderingAllowed(false);
		tableOcorrencia.getColumnModel().getColumn(0).setPreferredWidth(15);
		
		tableOcorrencia.setPreferredSize(new Dimension(200, 400));
		scroll2 = new JScrollPane(tableOcorrencia);
		frame.add(scroll2);
		
		btS = new JButton("Salvar dados");
		btS.setPreferredSize(new Dimension(130, 20));
		
		btI = new JButton("Inserir linha");
		btI.setPreferredSize(new Dimension(130, 20));
		
		btE = new JButton("Excluir");
		btE.setPreferredSize(new Dimension(130, 20));
		
		btA = new JButton("Atualizar Dados");
		btA.setPreferredSize(new Dimension(130, 20));
		
		frame.add(btS);
		frame.add(btI);
		frame.add(btE);
		frame.add(btA);
		
		
		frame.setVisible(true);
// Cidadão (id, nome, número documento, endereço, telefone, email)
// Ocorrência (id, data, descrição, local, id_cidadao).
	}

}
