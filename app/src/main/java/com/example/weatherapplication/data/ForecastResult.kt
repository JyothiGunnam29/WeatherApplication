package com.example.weatherapplication.data

import com.google.gson.annotations.SerializedName

class ForecastResult {
    /**
     * cod : 200
     * message : 0
     * cnt : 40
     * list : [{"dt":1727298000,"main":{"temp":24.18,"feels_like":25,"temp_min":23.08,"temp_max":24.18,"pressure":1005,"sea_level":1005,"grnd_level":948,"humidity":90,"temp_kf":1.1},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":83},"wind":{"speed":4.71,"deg":255,"gust":10.52},"visibility":10000,"pop":0.07,"sys":{"pod":"n"},"dt_txt":"2024-09-25 21:00:00"},{"dt":1727308800,"main":{"temp":23.33,"feels_like":24.15,"temp_min":22.63,"temp_max":23.33,"pressure":1004,"sea_level":1004,"grnd_level":948,"humidity":93,"temp_kf":0.7},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":91},"wind":{"speed":4.76,"deg":252,"gust":9.91},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-26 00:00:00"},{"dt":1727319600,"main":{"temp":24.11,"feels_like":24.87,"temp_min":24.11,"temp_max":24.11,"pressure":1007,"sea_level":1007,"grnd_level":951,"humidity":88,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":5.43,"deg":244,"gust":7.94},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-26 03:00:00"},{"dt":1727330400,"main":{"temp":28.25,"feels_like":31.45,"temp_min":28.25,"temp_max":28.25,"pressure":1005,"sea_level":1005,"grnd_level":950,"humidity":72,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":97},"wind":{"speed":5.86,"deg":245,"gust":7.01},"visibility":10000,"pop":0.03,"sys":{"pod":"d"},"dt_txt":"2024-09-26 06:00:00"},{"dt":1727341200,"main":{"temp":29.18,"feels_like":32.55,"temp_min":29.18,"temp_max":29.18,"pressure":1002,"sea_level":1002,"grnd_level":947,"humidity":67,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":85},"wind":{"speed":5.85,"deg":239,"gust":6.83},"visibility":10000,"pop":0.71,"rain":{"3h":0.66},"sys":{"pod":"d"},"dt_txt":"2024-09-26 09:00:00"},{"dt":1727352000,"main":{"temp":26.44,"feels_like":26.44,"temp_min":26.44,"temp_max":26.44,"pressure":1003,"sea_level":1003,"grnd_level":948,"humidity":81,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":73},"wind":{"speed":5.07,"deg":240,"gust":8.34},"visibility":10000,"pop":0.96,"rain":{"3h":1.44},"sys":{"pod":"d"},"dt_txt":"2024-09-26 12:00:00"},{"dt":1727362800,"main":{"temp":24.5,"feels_like":25.28,"temp_min":24.5,"temp_max":24.5,"pressure":1006,"sea_level":1006,"grnd_level":950,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":73},"wind":{"speed":4.77,"deg":238,"gust":11.08},"visibility":10000,"pop":0.43,"rain":{"3h":0.18},"sys":{"pod":"n"},"dt_txt":"2024-09-26 15:00:00"},{"dt":1727373600,"main":{"temp":23.73,"feels_like":24.46,"temp_min":23.73,"temp_max":23.73,"pressure":1006,"sea_level":1006,"grnd_level":951,"humidity":88,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":86},"wind":{"speed":5.7,"deg":250,"gust":12.59},"visibility":10000,"pop":0.29,"sys":{"pod":"n"},"dt_txt":"2024-09-26 18:00:00"},{"dt":1727384400,"main":{"temp":23.08,"feels_like":23.77,"temp_min":23.08,"temp_max":23.08,"pressure":1005,"sea_level":1005,"grnd_level":949,"humidity":89,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":98},"wind":{"speed":6.52,"deg":251,"gust":13.3},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-26 21:00:00"},{"dt":1727395200,"main":{"temp":22.42,"feels_like":23.07,"temp_min":22.42,"temp_max":22.42,"pressure":1006,"sea_level":1006,"grnd_level":950,"humidity":90,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":99},"wind":{"speed":5.62,"deg":246,"gust":12.41},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-27 00:00:00"},{"dt":1727406000,"main":{"temp":24.55,"feels_like":25.2,"temp_min":24.55,"temp_max":24.55,"pressure":1009,"sea_level":1009,"grnd_level":953,"humidity":82,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":7.34,"deg":251,"gust":10.95},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-27 03:00:00"},{"dt":1727416800,"main":{"temp":27.76,"feels_like":30.33,"temp_min":27.76,"temp_max":27.76,"pressure":1008,"sea_level":1008,"grnd_level":952,"humidity":71,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":99},"wind":{"speed":6.92,"deg":258,"gust":8.53},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-27 06:00:00"},{"dt":1727427600,"main":{"temp":28.33,"feels_like":31.02,"temp_min":28.33,"temp_max":28.33,"pressure":1005,"sea_level":1005,"grnd_level":950,"humidity":68,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":6.56,"deg":254,"gust":8.13},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-27 09:00:00"},{"dt":1727438400,"main":{"temp":26.5,"feels_like":26.5,"temp_min":26.5,"temp_max":26.5,"pressure":1006,"sea_level":1006,"grnd_level":950,"humidity":76,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":4.35,"deg":245,"gust":8.65},"visibility":10000,"pop":0.11,"sys":{"pod":"d"},"dt_txt":"2024-09-27 12:00:00"},{"dt":1727449200,"main":{"temp":25,"feels_like":25.62,"temp_min":25,"temp_max":25,"pressure":1008,"sea_level":1008,"grnd_level":953,"humidity":79,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":100},"wind":{"speed":3.24,"deg":233,"gust":8.83},"visibility":10000,"pop":0.02,"sys":{"pod":"n"},"dt_txt":"2024-09-27 15:00:00"},{"dt":1727460000,"main":{"temp":24.44,"feels_like":25,"temp_min":24.44,"temp_max":24.44,"pressure":1008,"sea_level":1008,"grnd_level":952,"humidity":79,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":100},"wind":{"speed":3.97,"deg":248,"gust":10.89},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-27 18:00:00"},{"dt":1727470800,"main":{"temp":23.34,"feels_like":23.92,"temp_min":23.34,"temp_max":23.34,"pressure":1007,"sea_level":1007,"grnd_level":951,"humidity":84,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":98},"wind":{"speed":4.74,"deg":256,"gust":10.92},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-27 21:00:00"},{"dt":1727481600,"main":{"temp":22.48,"feels_like":23.06,"temp_min":22.48,"temp_max":22.48,"pressure":1008,"sea_level":1008,"grnd_level":952,"humidity":87,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":99},"wind":{"speed":4.31,"deg":249,"gust":10.19},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-28 00:00:00"},{"dt":1727492400,"main":{"temp":25.12,"feels_like":25.72,"temp_min":25.12,"temp_max":25.12,"pressure":1011,"sea_level":1011,"grnd_level":955,"humidity":78,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":93},"wind":{"speed":5.56,"deg":258,"gust":8.26},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-28 03:00:00"},{"dt":1727503200,"main":{"temp":28.93,"feels_like":31.54,"temp_min":28.93,"temp_max":28.93,"pressure":1009,"sea_level":1009,"grnd_level":954,"humidity":64,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":96},"wind":{"speed":5.39,"deg":260,"gust":6.26},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-28 06:00:00"},{"dt":1727514000,"main":{"temp":29.08,"feels_like":31.82,"temp_min":29.08,"temp_max":29.08,"pressure":1007,"sea_level":1007,"grnd_level":952,"humidity":64,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":4.84,"deg":264,"gust":5.79},"visibility":10000,"pop":0.02,"sys":{"pod":"d"},"dt_txt":"2024-09-28 09:00:00"},{"dt":1727524800,"main":{"temp":27.33,"feels_like":29.53,"temp_min":27.33,"temp_max":27.33,"pressure":1007,"sea_level":1007,"grnd_level":952,"humidity":71,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":2.89,"deg":262,"gust":4.92},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-28 12:00:00"},{"dt":1727535600,"main":{"temp":25.51,"feels_like":26.02,"temp_min":25.51,"temp_max":25.51,"pressure":1010,"sea_level":1010,"grnd_level":954,"humidity":73,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":65},"wind":{"speed":1.94,"deg":246,"gust":2.75},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-28 15:00:00"},{"dt":1727546400,"main":{"temp":24.89,"feels_like":25.37,"temp_min":24.89,"temp_max":24.89,"pressure":1010,"sea_level":1010,"grnd_level":954,"humidity":74,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":57},"wind":{"speed":1.24,"deg":234,"gust":1.45},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-28 18:00:00"},{"dt":1727557200,"main":{"temp":23.98,"feels_like":24.47,"temp_min":23.98,"temp_max":23.98,"pressure":1009,"sea_level":1009,"grnd_level":953,"humidity":78,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":97},"wind":{"speed":2.13,"deg":226,"gust":2.7},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-28 21:00:00"},{"dt":1727568000,"main":{"temp":23.49,"feels_like":24.06,"temp_min":23.49,"temp_max":23.49,"pressure":1010,"sea_level":1010,"grnd_level":954,"humidity":83,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":93},"wind":{"speed":2.23,"deg":252,"gust":3.04},"visibility":10000,"pop":0.02,"sys":{"pod":"n"},"dt_txt":"2024-09-29 00:00:00"},{"dt":1727578800,"main":{"temp":26.58,"feels_like":26.58,"temp_min":26.58,"temp_max":26.58,"pressure":1012,"sea_level":1012,"grnd_level":956,"humidity":75,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":72},"wind":{"speed":2.81,"deg":297,"gust":3.38},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2024-09-29 03:00:00"},{"dt":1727589600,"main":{"temp":30.08,"feels_like":33.19,"temp_min":30.08,"temp_max":30.08,"pressure":1010,"sea_level":1010,"grnd_level":955,"humidity":61,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":64},"wind":{"speed":2.84,"deg":284,"gust":3.22},"visibility":10000,"pop":0.2,"rain":{"3h":0.12},"sys":{"pod":"d"},"dt_txt":"2024-09-29 06:00:00"},{"dt":1727600400,"main":{"temp":30.47,"feels_like":33.53,"temp_min":30.47,"temp_max":30.47,"pressure":1008,"sea_level":1008,"grnd_level":953,"humidity":59,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":2.74,"deg":262,"gust":3.4},"visibility":9434,"pop":0.66,"rain":{"3h":2.73},"sys":{"pod":"d"},"dt_txt":"2024-09-29 09:00:00"},{"dt":1727611200,"main":{"temp":27.87,"feels_like":30.8,"temp_min":27.87,"temp_max":27.87,"pressure":1008,"sea_level":1008,"grnd_level":953,"humidity":73,"temp_kf":0},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"clouds":{"all":93},"wind":{"speed":1.4,"deg":246,"gust":1.57},"visibility":10000,"pop":0.74,"rain":{"3h":4.14},"sys":{"pod":"d"},"dt_txt":"2024-09-29 12:00:00"},{"dt":1727622000,"main":{"temp":26.34,"feels_like":26.34,"temp_min":26.34,"temp_max":26.34,"pressure":1010,"sea_level":1010,"grnd_level":955,"humidity":77,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":78},"wind":{"speed":1.43,"deg":211,"gust":1.43},"visibility":10000,"pop":0.39,"rain":{"3h":0.16},"sys":{"pod":"n"},"dt_txt":"2024-09-29 15:00:00"},{"dt":1727632800,"main":{"temp":25.98,"feels_like":25.98,"temp_min":25.98,"temp_max":25.98,"pressure":1011,"sea_level":1011,"grnd_level":955,"humidity":79,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":88},"wind":{"speed":1.51,"deg":219,"gust":1.61},"visibility":10000,"pop":0.13,"sys":{"pod":"n"},"dt_txt":"2024-09-29 18:00:00"},{"dt":1727643600,"main":{"temp":25.25,"feels_like":25.95,"temp_min":25.25,"temp_max":25.25,"pressure":1008,"sea_level":1008,"grnd_level":953,"humidity":81,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":100},"wind":{"speed":1.99,"deg":269,"gust":2.47},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-29 21:00:00"},{"dt":1727654400,"main":{"temp":24.48,"feels_like":25.15,"temp_min":24.48,"temp_max":24.48,"pressure":1009,"sea_level":1009,"grnd_level":953,"humidity":83,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":98},"wind":{"speed":1.73,"deg":283,"gust":2.19},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2024-09-30 00:00:00"},{"dt":1727665200,"main":{"temp":27.55,"feels_like":29.82,"temp_min":27.55,"temp_max":27.55,"pressure":1011,"sea_level":1011,"grnd_level":956,"humidity":70,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":77},"wind":{"speed":2.1,"deg":308,"gust":2.59},"visibility":10000,"pop":0.2,"sys":{"pod":"d"},"dt_txt":"2024-09-30 03:00:00"},{"dt":1727676000,"main":{"temp":31.08,"feels_like":33.82,"temp_min":31.08,"temp_max":31.08,"pressure":1010,"sea_level":1010,"grnd_level":955,"humidity":55,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":77},"wind":{"speed":2.44,"deg":287,"gust":3.06},"visibility":10000,"pop":0.17,"sys":{"pod":"d"},"dt_txt":"2024-09-30 06:00:00"},{"dt":1727686800,"main":{"temp":31.39,"feels_like":34.66,"temp_min":31.39,"temp_max":31.39,"pressure":1006,"sea_level":1006,"grnd_level":952,"humidity":56,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":86},"wind":{"speed":3.7,"deg":289,"gust":3.88},"visibility":10000,"pop":0.21,"sys":{"pod":"d"},"dt_txt":"2024-09-30 09:00:00"},{"dt":1727697600,"main":{"temp":28.39,"feels_like":31.44,"temp_min":28.39,"temp_max":28.39,"pressure":1006,"sea_level":1006,"grnd_level":951,"humidity":70,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":91},"wind":{"speed":2.5,"deg":294,"gust":3.35},"visibility":10000,"pop":0.63,"rain":{"3h":0.66},"sys":{"pod":"d"},"dt_txt":"2024-09-30 12:00:00"},{"dt":1727708400,"main":{"temp":25.58,"feels_like":26.33,"temp_min":25.58,"temp_max":25.58,"pressure":1009,"sea_level":1009,"grnd_level":953,"humidity":82,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":97},"wind":{"speed":2.71,"deg":319,"gust":4.4},"visibility":10000,"pop":0.56,"rain":{"3h":1.06},"sys":{"pod":"n"},"dt_txt":"2024-09-30 15:00:00"},{"dt":1727719200,"main":{"temp":24.86,"feels_like":25.62,"temp_min":24.86,"temp_max":24.86,"pressure":1008,"sea_level":1008,"grnd_level":953,"humidity":85,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":98},"wind":{"speed":2.33,"deg":328,"gust":3.27},"visibility":10000,"pop":0.71,"rain":{"3h":2.07},"sys":{"pod":"n"},"dt_txt":"2024-09-30 18:00:00"}]
     * city : {"id":1269843,"name":"Hyderabad","coord":{"lat":17.3753,"lon":78.4744},"country":"IN","population":3597816,"timezone":19800,"sunrise":1727224526,"sunset":1727268003}
     */
    var cod: String? = null
    var message: Int = 0
    var cnt: Int = 0
    var city: CityBean? = null
    var list: List<ListBean>? = null

    class CityBean {
        /**
         * id : 1269843
         * name : Hyderabad
         * coord : {"lat":17.3753,"lon":78.4744}
         * country : IN
         * population : 3597816
         * timezone : 19800
         * sunrise : 1727224526
         * sunset : 1727268003
         */
        var id: Int = 0
        var name: String? = null
        var coord: CoordBean? = null
        var country: String? = null
        var population: Int = 0
        var timezone: Int = 0
        var sunrise: Int = 0
        var sunset: Int = 0

        class CoordBean {
            /**
             * lat : 17.3753
             * lon : 78.4744
             */
            var lat: Double = 0.0
            var lon: Double = 0.0
        }
    }

    class ListBean {
        /**
         * dt : 1727298000
         * main : {"temp":24.18,"feels_like":25,"temp_min":23.08,"temp_max":24.18,"pressure":1005,"sea_level":1005,"grnd_level":948,"humidity":90,"temp_kf":1.1}
         * weather : [{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}]
         * clouds : {"all":83}
         * wind : {"speed":4.71,"deg":255,"gust":10.52}
         * visibility : 10000
         * pop : 0.07
         * sys : {"pod":"n"}
         * dt_txt : 2024-09-25 21:00:00
         * rain : {"3h":0.66}
         */
        var dt: Long = 0
        var main: MainBean? = null
        var clouds: CloudsBean? = null
        var wind: WindBean? = null
        var visibility: Int = 0
        var pop: Double = 0.0
        var sys: SysBean? = null
        var dt_txt: String? = null
        var rain: RainBean? = null
        var weather: List<WeatherBean>? = null

        class MainBean {
            /**
             * temp : 24.18
             * feels_like : 25
             * temp_min : 23.08
             * temp_max : 24.18
             * pressure : 1005
             * sea_level : 1005
             * grnd_level : 948
             * humidity : 90
             * temp_kf : 1.1
             */
            var temp: Double = 0.0
            var feels_like: Double = 0.0
            var temp_min: Double = 0.0
            var temp_max: Double = 0.0
            var pressure: Int = 0
            var sea_level: Int = 0
            var grnd_level: Int = 0
            var humidity: Int = 0
            var temp_kf: Double = 0.0
        }

        class CloudsBean {
            /**
             * all : 83
             */
            var all: Int = 0
        }

        class WindBean {
            /**
             * speed : 4.71
             * deg : 255
             * gust : 10.52
             */
            var speed: Double = 0.0
            var deg: Int = 0
            var gust: Double = 0.0
        }

        class SysBean {
            /**
             * pod : n
             */
            var pod: String? = null
        }

        class RainBean {
            /**
             * 3h : 0.66
             */
            @SerializedName("3h")
            private var `_$3h` = 0.0

            fun `get_$3h`(): Double {
                return `_$3h`
            }

            fun `set_$3h`(`_$3h`: Double) {
                this.`_$3h` = `_$3h`
            }
        }

        class WeatherBean {
            /**
             * id : 803
             * main : Clouds
             * description : broken clouds
             * icon : 04n
             */
            var id: Int = 0
            var main: String? = null
            var description: String? = null
            var icon: String? = null
        }
    }
}
