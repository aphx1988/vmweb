package com.example.aphx.vmweb.controller;

import com.example.aphx.vmweb.entity.Res;
import com.example.aphx.vmweb.entity.Stat;
import com.example.aphx.vmweb.entity.Video;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    String pythonPath = "D:\\proj\\portait\\wc-test.py";
    void genImg(){
        Process proc;
        try {
            proc = Runtime.getRuntime().exec("python "+pythonPath);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/stat")
    public Res<Stat> stat(@RequestParam(value = "id",defaultValue = "1") String id) {
        Stat resObj = new Stat();

        resObj.setImgSrc();
    }
}
