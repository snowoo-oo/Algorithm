import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        List<Music> musicList = new ArrayList<>();
        Map<String, Integer> musicMap = new HashMap<>();
        
        for(int i=0;i<genres.length;i++){
            musicList.add(new Music(genres[i], plays[i], i));
            musicMap.put(genres[i], musicMap.getOrDefault(genres[i],0) + plays[i]);
        }
        
        Collections.sort(musicList, new Comparator<Music>(){
            public int compare(Music a, Music b){
                if(a.genre.equals(b.genre)){
                    return a.compareTo(b);
                }else{
                    return musicMap.get(b.genre) - musicMap.get(a.genre);
                }
            }
        });
        
        Map<String, Integer> bestMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(Music music : musicList){
            if(!bestMap.containsKey(music.genre)){
                bestMap.put(music.genre, 1);
                result.add(music.idx);
            }else{
                if(bestMap.get(music.genre) == 1)
                {
                    bestMap.put(music.genre, 2);
                    result.add(music.idx);
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}

class Music implements Comparable<Music>{
    
    String genre;
    int play;
    int idx;
    
    Music(String genre, int play, int idx){
        
        this.genre = genre;
        this.play = play;
        this.idx = idx;
    }
    
    @Override
    public int compareTo(Music m){
        
        if(play > m.play) return -1;
        else if(play < m.play) return 1;
        else{
            return idx - m.idx;       
        }
    }
}