# Annotation @Autowired

- Позволяет не внедрять зависимости вручную.
- Подбирает подходящие бины по ихтипу (класс или интерфейс).
- Можно использовать на полях, сеттерах и конструкторах.
- Внедрит зависимость в приватное поле, даже если нет конструктора или сеттера. Делает она это с помощью рефлексии (Java Reflection API).

## Задание

1. Внедрим зависимости  через конструкторы, сеттеры и поля.
2. Разберем некоторые тонкости аннотации.
3. Увидим ошибку, когда Spring не находит подходящего бина для внедрения.
4. Увидим проблему неоднозначности, когда несколько бинов подходят для внедрения.

## Решение

1. Сначала преобразуем класс `MusicPlayer`, чтобы он работал только с одним видом типа музыки, например, `classicalMusic`.
2. У нас два бина (с аннотацией `@Component`) - `ClassicalMusic` и `Musicplayer`.
3. Добавляем `@Autowired` у конструктора `MusicPlayer`, чтобы указать, куда внедрять бин `ClassicalMusic`.
4. Вызовем из контекста бин `musicPlayer`.
5. Если убрать аннотация `@Component` у `ClassicalMusic`, то  Spring не  увидит подходящий для внедрения бин - выбросится исключение `Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'musicPlayer' defined in file [/Users/simao/Desktop/springProject/target/classes/ru/solomakhin/spring/MusicPlayer.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'ru.solomakhin.spring.ClassicalMusic' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}`.
6. Вернем `MsicPlayer` к исходному виду - чтобы проверить работу, если подходящих бинов несколько (закомменченный код) - появится ошибка `Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'ru.solomakhin.spring.Music' available: expected single matching bean but found 3: classicalMusic,rapMusic,rock`.
7. Внедряем зависимость через сеттер - следующий репозиторий.


### Как работает

1. Spring сканирует все классы с аннотацией `@Component` и создает  бины для этих классов.
2. Spring сканирует все созданные бины и проверяет, подходит ли хотябы один бин в качестве зависимости там, где мы указали `@Autowired`.
3. Если находится один подходящий бин, он внедряется в качестве зависимости.
4. Если не находится ни одного бина - ошибка.
5. Если несколько бинов подходят - неоднозначность.

