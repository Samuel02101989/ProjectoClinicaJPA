package br.com.clinica.jasperClass;

import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorios {

	private Connection conexao;

	// Imprime e gera relatorio de Medicos
	public void imprimirMedico() {

		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressao do relatorio Medico?", "Atencao",
				JOptionPane.YES_NO_OPTION);
		if (confirma == JOptionPane.YES_OPTION) {

			try {
				// usando a classe JasperPrint para preparar a impressao de
				// relatorio
				JasperPrint print = JasperFillManager.fillReport(
						"D:\\nova\\faculdade 4°\\ProjectoClinicaJPA\\src\\br\\com\\clinica\\relatorios\\Medicos.jasper",
						null, conexao);

				// a linha abaixo exibir o relatorio atraves da classe
				// JasperViewer
				JasperViewer.viewReport(print, false);

			} catch (Exception FileNotFoundException) {
				JOptionPane.showMessageDialog(null, "File not found!!");
				System.out.println("File not found!!");

			}
		}
	}

	// Imprime e gera relatorio de Pacientes
	public void imprimirPaciente() {
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressao do relatorio Paciente?", "Atencao",
				JOptionPane.YES_NO_OPTION);
		if (confirma == JOptionPane.YES_OPTION) {
			try {
				JasperPrint print = JasperFillManager.fillReport(
						"D:\\nova\\faculdade 4°\\ProjectoClinicaJPA\\src\\br\\com\\clinica\\relatorios\\Paciente.jasper",
						null, conexao);
				JasperViewer.viewReport(print, false);

			} catch (Exception FileNotFoundException) {
				JOptionPane.showMessageDialog(null, "File not found!!");
				System.out.println("File not found!!");
			}
		}
	}
	// Imprime e gera relatorio de Usuarios

	public void imprimirUsuarios() {
		int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressao do relatorio Usuario?", "Atencao",
				JOptionPane.YES_NO_OPTION);
		if (confirma == JOptionPane.YES_OPTION) {
			try {
				JasperPrint print = JasperFillManager.fillReport(
						"D:\\nova\\faculdade 4°\\ProjectoClinicaJPA\\src\\br\\com\\clinica\\relatorios\\Usuarios.jasper",
						null, conexao);
				JasperViewer.viewReport(print, false);

			} catch (Exception FileNotFoundException) {
				JOptionPane.showMessageDialog(null, "File not found!!");
				System.out.println("File not found!!");
			}
		}
	}
}
