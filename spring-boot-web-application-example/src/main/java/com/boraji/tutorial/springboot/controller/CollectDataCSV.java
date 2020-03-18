package com.boraji.tutorial.springboot.controller;

import com.boraji.tutorial.springboot.service.AppendDataCSV;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.sql.DataSourceDefinition;
import java.io.IOException;

@Controller
class CollectDataCSV {

   private AppendDataCSV appendDataCSV;

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name,
                          @RequestParam("ticketnumbertoday") String ticketnumbertoday,
                          @RequestParam("todaysstatus") String todaysstatus,
                          @RequestParam("ticketnumbertommows") String ticketnumbertommows,
                          @RequestParam("tommmorowsstatus") String tommmorowsstatus
                        ) throws IOException {


      appendDataCSV.storeToExcel(name,ticketnumbertoday,todaysstatus,ticketnumbertommows,tommmorowsstatus);

      return "hello";
   }
}
