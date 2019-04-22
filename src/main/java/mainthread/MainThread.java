package mainthread;

import entity.VideoInformation;
import entity.VideoViewManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainThread {
    public static void main(String[] args) {
        // ReadFile
        try {
            FileReader file = new FileReader("src/main/resources/tomandjerry.txt");
            BufferedReader br = new BufferedReader(file);
            String line;

            List<VideoInformation> listvideo = new ArrayList<VideoInformation>();
            int count = 0;

            while ((line = br.readLine()) != null){
                if (count == 0){
                    count++;
                    continue;
                }
                System.out.println(line);
                // căt chuỗi theo khoảng trắng
                String[] spilited = line.split("\\s{2,}");
                if (spilited.length == 4){
                    String day = spilited[0];
                    String id = spilited[1];
                    String title = spilited[2];
                    String view = spilited[3];
                    VideoInformation infor = new VideoInformation(day,id,title,view);
                    listvideo.add(infor);
                }
                count++;
            }


            HashMap<String, VideoViewManager> listview = new HashMap<>();
            for (VideoInformation vi:
                 listvideo) {
                double currentView = 0;
                    if (listview.containsKey(vi.getTitile())){
                        VideoViewManager videoViewManager = listview.get(vi.getTitile());
                        currentView = Double.parseDouble(videoViewManager.getView());
                    }
                    currentView += Double.parseDouble(vi.getView());
                    VideoViewManager managerVideo = new VideoViewManager(vi.getId(),vi.getTitile(),String.valueOf(currentView));
                    listview.put(vi.getTitile(),managerVideo);

            }
            System.out.println("++++++++++++++ total views of  video ++++++++++++++");
            System.out.printf("%15s |%15s |%15s \n" ,"MaVideo","Tieu de","View");
            for (String title:
                    listview.keySet()) {

                VideoViewManager videomanager = listview.get(title);
                System.out.printf("%15s |%15s |%15s  \n" ,videomanager.getId(),title,videomanager.getView());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
