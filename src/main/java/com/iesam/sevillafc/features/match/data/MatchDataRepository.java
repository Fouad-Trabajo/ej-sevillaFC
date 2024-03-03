package com.iesam.sevillafc.features.match.data;

import com.iesam.sevillafc.features.match.data.local.FileLocalDataSourceMatch;
import com.iesam.sevillafc.features.match.domain.MatchRepository;
import com.iesam.sevillafc.features.match.domain.models.Match;

public class MatchDataRepository implements MatchRepository {

    //Instancia de fichero
    private static FileLocalDataSourceMatch fileLocalDataSourceMatch;

    //Instancia de patrón SinleTon
    private static MatchDataRepository instance= null;

    //Método del patrón SingleTon
    public static MatchDataRepository newInstance(){
        if(instance==null){
            instance= new MatchDataRepository();
        }
        return instance;
    }


    @Override
    public void createMatch(Match match) {
        fileLocalDataSourceMatch.save(match);
    }

    @Override
    public Match obtainMatch(String id) {
        return fileLocalDataSourceMatch.obtain();
    }
}
