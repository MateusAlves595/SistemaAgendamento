package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.ui.MedicoDialog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDao {
    
    private final static String URL = "C:\\Users\\22282205\\Java\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282205\\Java\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) {//CREATE
        especialidades.add(e);

        //Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocoreu um erro");
        }
    }

    public static ArrayList<Especialidade> getEspecialidades() {//READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {//READ
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;

    }

    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        atualizarArquivo();
        
    }

    private static void atualizarArquivo() {
        //Passo 1 - Criar uma representação dos arquivos que serão manipulados
            File arquivoAtual = new File(URL);
            File arquivoTemp = new File(URL_TEMP);

            try {
                //Criar o arquivo temporario
                arquivoTemp.createNewFile();

                //Abrir o arquivo temporário para escrita
                BufferedWriter bwTemp = Files.newBufferedWriter(
                        PATH_TEMP,
                        StandardOpenOption.APPEND,
                        StandardOpenOption.WRITE);

                //Iterar na lista para adicionar as especialidades 
                //no arquivo temporário, exceto o registro que
                //não queremos mais
                for (Especialidade e : especialidades) {
                    bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                    bwTemp.newLine();
                }
                
                bwTemp.close();
                
                arquivoAtual.delete();
                
                arquivoTemp.renameTo(arquivoAtual);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidadeAtualizada.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
        
        atualizarArquivo();
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar os dados da linha em uma especialidade 
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2], Integer.valueOf(vetor[0]));

                especialidades.add(e);

                //ler a próxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getTebelaEpecialidades() {

        String[] titulo = {"Código", "Nome da especialidade", "descrição"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
        }

        return new DefaultTableModel(dados, titulo);
    }
    
    public static DefaultListModel<Especialidade> getListaEspecialidades() {
        DefaultListModel<Especialidade> listaEspecialidade = new DefaultListModel<>();
        for (Especialidade e : getEspecialidades()) {
            listaEspecialidade.addElement(e);
            listaEspecialidade.toString();
        }
        return listaEspecialidade;
    }

}
