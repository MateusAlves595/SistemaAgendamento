package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDao {
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    
    public static void criarListaDePlanosDeSaude() {
        PlanoDeSaude p1 = new PlanoDeSaude("2228-9432-5539-4123", "Amil", "Gold",  LocalDate.of(2022, 10, 20));
        PlanoDeSaude p2 = new PlanoDeSaude("5927-3342-7900-5214", "NotreDame", "Prata", LocalDate.of(2022, 10, 20));
        PlanoDeSaude p3 = new PlanoDeSaude("6343-4682-5423-6745", "Porto Seguro", "Bronze",  LocalDate.of(2022, 10, 20));
        PlanoDeSaude p4 = new PlanoDeSaude("8745-8264-6732-7632", "Bradesco", "Prata",  LocalDate.of(2022, 10, 20));
        
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);
        planosDeSaude.add(p4);
              
    }
    
    public static DefaultTableModel getTabelaPlanoDeSaude() {
        String[] titulos = {"Código", "Número", "Operadora", "Categoria", "Validade"};
        String[][] dados = new String[planosDeSaude.size()][5];
        
        for(PlanoDeSaude p : planosDeSaude){
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNumero();
            dados[i][2] = p.getOperadora();
            dados[i][3] = p.getCategoria();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][4] = p.getValidade().format(barra);
            
            
        }
        return new DefaultTableModel(dados, titulos);
    }
    
    
    //metodos
    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() {
        return planosDeSaude;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for(PlanoDeSaude p : planosDeSaude){
            if (p.getCodigo() == codigo){
                return p;
            }
        }
        
        return null;
    } 
        
    public static void gravar(PlanoDeSaude p) {
        planosDeSaude.add(p);
    }
    
    public static void excluir(Integer codigo) {
        for(PlanoDeSaude p : planosDeSaude){
            if (p.getCodigo() == codigo){
                planosDeSaude.remove(p);
                break;
            }
        }
        
    }
    
    public static void atualizar(PlanoDeSaude planoAtualizado) {
         for(PlanoDeSaude p : planosDeSaude){
            if (p.getCodigo() == planoAtualizado.getCodigo()){
               planosDeSaude.set(planosDeSaude.indexOf(p), planoAtualizado);
                break;
            }
        }
    }
    
    
    
}
