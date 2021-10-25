# DependencyInjection2

* Внедряем зависимости через сеттер:
    1. Создадим сеттер `setMusic(Music music)`;
    2. В applicationContext.xml уберем тег `constructor-arg`, а вместо него будем использовать тег `property`, в котором укажем `name` и `ref`;
    3. До этого в applicationContext.xml в теге `constructor-arg` в `ref` мы внедряли ссылку на бин, тут попробуем внедрить числа и сттроки (при ссылке остается `ref="beanID"`);
    4. Также создадим отдельный файл .properties и будем брать значения оттуда;
    
## Создаем сеттер

1. При создании сеттера меням в applicationContext.xml тег `constructor-arg` на `property`, при этом в этом теге `name` - это имя сеттера, то есть сеттер без `set` + первая буква toLowerCase (setMusic превращается в music);
2. При ошибке компиляции от IDEA, указывающей на класс в бине, необходимо добавить нужный конструктор в классе (например, при ` <bean id="musicPlayer"
                                                                                                                                             class="ru.solomakhin.spring.MusicPlayer">
                                                                                                                                           <property name="music" ref="musicBean"/>
                                                                                                                                       </bean>` ничего не передается и необходимо создать конструктор `public MusicPlayer(){}`);
    
    
#### Работа спринга при внедрении сеттера:

При вызове `musicPlayer.playMusic();`:
1. Он создает бин (объект) класса MusicPlayer (`MusicPlayer musicPlayer1 = new MusicPlayer()`);
2. После вызывает у этого объекта сеттер, соответствующий названию нашей зависимости (`name` в applicationContext.xml) (`musicPlayer1.setMusic(music)`);
3. В сеттер в качестве объекта (music) передает тот бин, который был создан ранее (`musicBean`);
       
## Внедряем простые значения  

1. Создаем `String` и `int` с геттерами с сеттерами;
2. В applicationContext.xml бину `musicPlayer` назначим зависимости с простыми значениями в теге `property`;

## Внедряем из  отдельного файла:

1. Создаем файл с разрешением  .properties;
2. Вводим туда значени;
3. Импортируем файл musicPlayer.properties в applicationContext.xml (прописываем `    <context:property-placeholder location="classpath:musicPlayer.properties"/>`);
4. Меняем в теге `property` у `value` простые значения на `${musicPlayer.name}` и `${musicPlayer.volume}`;