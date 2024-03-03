package com.iesam.sevillafc.features.team.data;

import com.iesam.sevillafc.features.team.data.local.FileLocalDataSourceTeam;
import com.iesam.sevillafc.features.team.domain.TeamRepository;
import com.iesam.sevillafc.features.team.domain.models.Team;

public class TeamDataRepository implements TeamRepository {

    //Instancia de patrón SinleTon
    private static  TeamDataRepository instance=null;

    //Implementación del método
    public static TeamDataRepository newInstance(){
        if(instance==null){
            instance= new TeamDataRepository();
        }
        return instance;
    }

    //Instancia de fichero
    private static FileLocalDataSourceTeam fileLocalDataSourceTeam;
    @Override
    public void createTeam(Team team) {
        fileLocalDataSourceTeam.save(team);

    }

    @Override
    public Team obtainTeam(String id) {
        return fileLocalDataSourceTeam.obtain();
    }
}
