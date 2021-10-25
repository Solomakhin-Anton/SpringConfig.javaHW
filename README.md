# DependencyInjection2

* Внедряем зависимости через сеттер (несколько репозиториев):
    1. Создадим сеттер `setMusic(Music music)`;
    2. В applicationContext.xml уберем тег `constructor-arg`, а вместо него будем использовать тег `property`, в котором укажем `name` и `ref`;
    3. До этого в applicationContext.xml в теге `constructor-arg` в `ref` мы внедряли ссылку на бин, тут попробуем внедрить числа и сттроки (при ссылке остается `ref="beanID"`);
    4. Также создадим отдельный файл .properties и будем брать значения оттуда;
    
* Создаем сеттер.
    1. При создании сеттера меням в applicationContext.xml тег `constructor-arg` на `property`, при этом в этом теге `name` - это имя сеттера, то есть сеттер без `set` + первая буква toLowerCase (setMusic превращается в music);
    2. При ошибке компиляции от IDEA, указывающей на класс в бине, необходимо добавить нужный конструктор в классе (например, при ` <bean id="musicPlayer"
                                                                                                                                             class="ru.solomakhin.spring.MusicPlayer">
                                                                                                                                           <property name="music" ref="musicBean"/>
                                                                                                                                       </bean>` ничего не передается и необходимо создать конструктор `public MusicPlayer(){}`);
       
    