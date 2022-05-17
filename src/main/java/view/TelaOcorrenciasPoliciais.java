package view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.vo.CidadaoVO;

public class TelaOcorrenciasPoliciais {

	JFrame frame = new JFrame();

	public void apresentarTelaOcorrenciasPoliciais(CidadaoVO cidadaoVO) {
		//System.out.println("Executando...");
		
		frame.setTitle("Registro de Ocorrências Policiais");
		frame.setSize(600, 600); //1400, 700
		FlowLayout fl = new FlowLayout(); //FlowLayout.LEADING, FlowLayout.CENTER, ou FlowLayout.TRAILING.
		frame.setLayout(fl);
		
		String[] colunasCidadao = {"ID", "NOME", "Nº DOC.", "ENDEREÇO", "TELEFONE", "E-MAIL"};
		Object[][] linhasDeDadosCidadao = null;
		
		DefaultTableModel model1 = new DefaultTableModel(linhasDeDadosCidadao, colunasCidadao);
		JTable table1 = new JTable(model1);
		
		table1.setPreferredSize(new Dimension(200, 400));
		JScrollPane scroll1 = new JScrollPane(table1);
		frame.add(scroll1);
		
		
		FlowLayout fl2 = new FlowLayout(); //FlowLayout.LEADING, FlowLayout.CENTER, ou FlowLayout.TRAILING.
		frame.setLayout(fl2);
		
		String[] colunasOcorrencia = {"ID", "DATA", "DESCRIÇÃO", "LOCAL", "CIDADÃO"};
		Object[][] linhasDeDadosOcorrencia = null;
		
		DefaultTableModel model2 = new DefaultTableModel(linhasDeDadosOcorrencia, colunasOcorrencia);
		JTable table2 = new JTable(model2);
		
		table2.setPreferredSize(new Dimension(200, 400));
		JScrollPane scroll2 = new JScrollPane(table2);
		frame.add(scroll2);
		
		
		frame.setVisible(true);
// Cidadão (id, nome, número documento, endereço, telefone, email)
// Ocorrência (id, data, descrição, local, id_cidadao).
	}
	
	

}
