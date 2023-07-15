package com.vize_2.services;

import com.vize_2.entities.Backup;
import com.vize_2.entities.projections.IBackUp;
import com.vize_2.entities.projections.ITeams;
import com.vize_2.repositories.BackupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BackupService {

    final BackupRepository backupRepository;
    public HashMap<String,Object> backup() {
        List<IBackUp> list = new ArrayList<>();
        List<IBackUp> list2 = new ArrayList<>();
        HashMap<String, Object> hm = null;
        for (IBackUp backUp : backupRepository.list()) {
            hm = new LinkedHashMap<>();
            if (backUp.getTNAME().equals("B")) {
                list.add(backUp);
            }
            hm.put("B",list);
        }
        for (IBackUp backUp : backupRepository.list()) {
            if (backUp.getTNAME().equals("A")) {
                list2.add(backUp);
            }
            hm.put("A",list2);
        }
        return hm;
    }

}
