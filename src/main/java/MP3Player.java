
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;

public class MP3Player {
    private String file;
    private double seg;
    private AdvancedPlayer player;
    private Queue<AdvancedPlayer> queue = new PriorityQueue<AdvancedPlayer> ();

    public MP3Player(){};
    public MP3Player(String file, double seg, AdvancedPlayer player) {
        this.file = file;
        this.seg = seg;
        this.player = player;
    }

    public AdvancedPlayer getPlayer() {
        return player;
    }

    public void setPlayer(AdvancedPlayer player) {
        this.player = player;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public double getSeg() {
        return seg;
    }

    public void setSeg(double seg) {
        this.seg = seg;
    }

    public Queue<AdvancedPlayer> getQueue() {
        return queue;
    }

    public void setQueue(Queue<AdvancedPlayer> queue) {
        this.queue = queue;
    }
    
    public void addItem(Queue<String> pq){
        pq.add(this.file);
    }
    
    public void removeItem(Queue<String> pq,String dir){
        pq.remove(dir);
    }

}