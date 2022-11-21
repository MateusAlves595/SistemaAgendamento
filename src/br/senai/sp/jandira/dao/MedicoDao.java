package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDao {

    private final static String URL = "C:\\Users\\22282205\\Java\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282205\\Java\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static void criarListaDeMedicos() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                String[] vetor = linha.split(";");
                Medico m = new Medico(vetor[1], vetor[2], vetor[3], Integer.valueOf(vetor[0]));

                medicos.add(m);

                linha = leitor.readLine();

            }
            leitor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getTabelaMedicos() {
        String[] titulo = {"Código", "CRM", "Nome do(a) médico(a)", "Telefone"};
        String[][] dados = new String[medicos.size()][4];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
        }
        return new DefaultTableModel(dados, titulo);
    }

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;

    }

    private static void atualizarArquivo() {
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        try {
            arquivoTemp.createNewFile();
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Gravar,atualizar e excluir
    public static void gravar (Medico m) {
        medicos.add(m);
        
        try
        {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        }catch (IOException error){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro ao escrever o arquivo");
        }
    }
    
    public static void excluir(Integer codigo) {
        for (Medico m : medicos) {
            if(m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }
        
        atualizarArquivo();
    }
    
    public static void atualizar(Medico medicoAtualizado) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }
        }
        
        atualizarArquivo();
    }

}
