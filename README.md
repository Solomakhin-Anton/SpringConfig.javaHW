# DependencyInjection3

##  Внедряем List<>:

1. В applicationProperties.xml создаем нужное количество бинов (в нашем случае - 3):

     `<bean id="musicBean1"
           class="ru.alishev.springcourse.ClassicalMusic">
     </bean> `
     
     `<bean id="musicBean2"
           class="ru.alishev.springcourse.RockMusic">
     </bean>`
 
     `<bean id="musicBean3"
           class="ru.alishev.springcourse.RapMusic">
     </bean>`
     
2. В бине `musicPlayer` добавляем property с тегом `<list>`:

        <property name="musicList">
            <list>
                <ref bean="musicBean1"/>
                <ref bean="musicBean2"/>
                <ref bean="musicBean3"/>
            </list>
        </property>

3. В классе `MusicPlayer` добавляем коллекцию `private List<Music> musicList = new ArrayList<>();`;
4. Делаем сеттер `setMusicList(List<Music> musicList)`;
5. Создаем метод `playMusicList()`, в котором выводим на экран все песни по-очереди;
6. Вызываем метод `playMusicList()`.
