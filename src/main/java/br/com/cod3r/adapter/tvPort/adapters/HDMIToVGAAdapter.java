package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;
import br.com.cod3r.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    //Composição
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("Conectando ao adaptador HDMI/VGA...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Convertendo imagem do HDMI para VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("VGA não suporta vídeos");
    }

}
