/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

/**
 *
 * @author Usuario
 */
public class AdvancedAudioPlayerAdapter implements AudioPlayer{
    
    private AdvancedAudioPlayer advancedAudioPlayer; 
    
    AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer){
        this.advancedAudioPlayer = advancedAudioPlayer;
    }
    
    @Override
    public void play(String audioType, String fileName) {
        switch(audioType){
            case "MP4":
                  advancedAudioPlayer.playMp4(fileName);
                  break;
            case "VLC":
                  advancedAudioPlayer.playVlc(fileName);
                  break;
            default:
                System.out.println("Este es un formato invalido!!!");
                break;
        }
        
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
    
}
