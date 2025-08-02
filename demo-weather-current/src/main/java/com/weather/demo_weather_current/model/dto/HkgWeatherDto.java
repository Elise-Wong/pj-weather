package com.weather.demo_weather_current.model.dto;

import java.rmi.server.RMIClassLoader;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonNaming(value = SnakeCaseStrategy.class)
public class HkgWeatherDto {
  private Rainfall rainfall;
  private String warningMessage;
  private String rainstormReminder;
  private Long icon;
  private LocalDateTime iconUpdateTime;
  private UvIndex uvindex;
  @JsonProperty(value = "updateTime")
  private LocalDateTime UvUpdateTime;
  private Temperature temperature;
  private String tcmessage;
  private String mintempFrom00To09;
  private String rainfallFrom00To12;
  private String rainfallLastMonth;
  private String rainfallJanuaryToLastMonth;
  private Humidity humidity;

  
//HOME-Rainfall
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Rainfall{
      private RainfallData data;

//HOME-Rainfall-data
      @Getter
      @Builder
      @AllArgsConstructor
      @NoArgsConstructor
      public static class RainfallData{
        @JsonProperty(value = "unit")
        private String rainfallUnit;
        private String place;
        @JsonProperty(value = "max")
        private Long maxRainfall;
        private String main;
        @JsonProperty(value = "min")
        private Long minRainfall;
      }
    }

//HOME-UvIndex
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UvIndex{
      private UvIndexData data;
      private String recordDesc;

//HOME-UvIndex-data
      @Getter
      @Builder
      @AllArgsConstructor
      @NoArgsConstructor
      public static class UvIndexData{
        private String place;
        @JsonProperty(value = "value")
        private Double UvValue;
        private String desc;
      }
    }

//HOME-Temperature
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Temperature{
      private TemperatureData data;
      private LocalDateTime recordTime;

//HOME-Temperature-data
      @Getter
      @Builder
      @AllArgsConstructor
      @NoArgsConstructor
      public static class TemperatureData{
        private String place;
        @JsonProperty(value = "value")
        private Double temperatureValue;
        @JsonProperty(value = "unit")
        private char temperatureUnit;
      }
    }

//HOME-Humidity
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Humidity{
      @JsonProperty(value = "recordTime")
      private LocalDateTime humidityRecordTime;
      private HumidityData data;

//HOME-Humidity-data
      @Getter
      @Builder
      @AllArgsConstructor
      @NoArgsConstructor
      public static class HumidityData{
        @JsonProperty(value = "unit")
        private String humidityUnit;
        @JsonProperty(value = "value")
        private Double humidityValue;
        private String place;
      }
    }


}
