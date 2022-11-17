package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class MedicoDao {
    
    private final static String URL = "C:\\Users\\22282205\\Java\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282205\\Java\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    
    public static void criarListaDeMedicos() {
        
    }
    
    public static DefaultTableModel getTabelaMedicos() {
        String[] titulo = {"Código", "CRM", "Nome do(a) médico(a)", "Telefone"};
        String[][] dados = new String[medicos.size()][4];
        
        for(Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
        }
        return new DefaultTableModel(dados, titulo);
    }
    
    
}
