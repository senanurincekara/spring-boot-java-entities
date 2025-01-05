package com.example.calisma.Service.impl;

import com.example.calisma.Repository.HomeRepository;
import com.example.calisma.Service.IHomeService;
import com.example.calisma.dto.DtoHome;
import com.example.calisma.dto.DtoRoom;
import com.example.calisma.entities.Home;
import com.example.calisma.entities.Room;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl implements IHomeService {
    @Autowired
    private HomeRepository homerepo;

    @Override
    public DtoHome findHomeById(Long id) {

        Optional<Home> optional = homerepo.findById(id);

        if(optional.isEmpty()){
            return null;
        }

        DtoHome dtoHome=new DtoHome();

        Home home=optional.get();
        BeanUtils.copyProperties(home , dtoHome);

        List<Room> dbrooms =optional.get().getRooms();
        BeanUtils.copyProperties(home ,dtoHome);

        if(dbrooms!=null && !dbrooms.isEmpty()){
            for(Room room :dbrooms){
                DtoRoom dtoRooms = new DtoRoom();
                BeanUtils.copyProperties(room , dtoRooms);
                dtoHome.getRooms().add(dtoRooms);
            }
        }

        return dtoHome;
    }
}
