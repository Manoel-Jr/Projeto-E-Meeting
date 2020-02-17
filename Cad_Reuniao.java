/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author junior
 */
public class Cad_Reuniao {
    
    private String pauta;
    private String ata;
    private String tema;
    private String nP;
    private String presenca;
    private String dia;
    private String hora;
    private String horaFim;
    private String proprietario;
    private String sala;
    private String sugestao;

    public Cad_Reuniao() {
    }

    public Cad_Reuniao(String pauta, String ata,String sala, String tema, String nP, String presenca, String dia, String hora,String horaFim, String proprietario, String sugestao) {
        this.pauta = pauta;
        this.ata = ata;
        this.tema = tema;
        this.nP = nP;
        this.presenca = presenca;
        this.dia = dia;
        this.hora = hora;
        this.horaFim = horaFim;
        this.proprietario = proprietario;
        this.sugestao = sugestao;
        this.sala = sala;
    }

    /**
     * @return the palta
     */
    public String getPauta() {
        return pauta;
    }

    /**
     * @param palta the palta to set
     */
    public void setPauta(String pauta) {
        this.pauta = pauta;
    }

    /**
     * @return the ata
     */
    public String getAta() {
        return ata;
    }

    /**
     * @param ata the ata to set
     */
    public void setAta(String ata) {
        this.ata = ata;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the nP
     */
    public String getnP() {
        return nP;
    }

    /**
     * @param nP the nP to set
     */
    public void setnP(String nP) {
        this.nP = nP;
    }

    /**
     * @return the presenca
     */
    public String getPresenca() {
        return presenca;
    }

    /**
     * @param presenca the presenca to set
     */
    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the horaFim
     */
    public String getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    /**
     * @return the proprietario
     */
    public String getProprietario() {
        return proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * @return the sugestao
     */
    public String getSugestao() {
        return sugestao;
    }

    /**
     * @param sugestao the sugestao to set
     */
    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }
    
    public String getSala(){
        return sala;
    }
    public void setSala(String sala){
        this.sala = sala;
    }
    

    @Override
    public String toString() {
        String str;
        
        str = "------------ Relatorio de Cadastro de Reunião -------------"+
                
                       "\n Pauta = "+getPauta()+
                       "\n Ata = "+getAta()+ 
                       "\n Tema = "+getTema()+
                       "\n Numero de Participantes = "+getnP()+
                       "\n Presença = "+getPresenca()+
                       "\n Dia = "+getDia()+
                       "\n Hora do Inicio = "+getHora()+
                       "\n Hora do Fim = "+getHoraFim()+
                       "\n Sala = "+ getSala()+
                       "\n Proprietario da Reunião = "+getProprietario()+
                       "\n Sugestão de Local = "+getSugestao();
        return str;
    }
}
