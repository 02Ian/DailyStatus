package com.boraji.tutorial.springboot.model;




import lombok.Getter;
import lombok.Setter;

import javax.annotation.sql.DataSourceDefinition;

public class AccessorsAndMutators {
   String ticketnumbertoday;
   String todaysstatus;
   String ticketnumbertommows;
   String tommmorowsstatus;

   public String getTicketnumbertoday() {
      return ticketnumbertoday;
   }

   public void setTicketnumbertoday(String ticketnumbertoday) {
      this.ticketnumbertoday = ticketnumbertoday;
   }

   public String getTodaysstatus() {
      return todaysstatus;
   }

   public void setTodaysstatus(String todaysstatus) {
      this.todaysstatus = todaysstatus;
   }

   public String getTicketnumbertommows() {
      return ticketnumbertommows;
   }

   public void setTicketnumbertommows(String ticketnumbertommows) {
      this.ticketnumbertommows = ticketnumbertommows;
   }

   public String getTommmorowsstatus() {
      return tommmorowsstatus;
   }

   public void setTommmorowsstatus(String tommmorowsstatus) {
      this.tommmorowsstatus = tommmorowsstatus;
   }
}
