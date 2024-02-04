# JavaPain - мы учим Java
## Задание 1

Создать maven-проект, принимающий на вход в консоль любую строку от пользователя, печатающая в ответ перевернутую строку с данным набором правил:
- переворот осуществляется исключительно для слов, всю строку не переворачиваем. Пример: введено "abc def", если бы переворачивали строку, то ответ был бы "fed cba", а надо "cba fed"
- если в составе слова присутствует не-буква, она сохраняет свое местоположение. Пример: "ab1c def4g". Ответ: "cb1a gfe4d"
  
После выполнения основного задания: покрытие тестами:
  с помощью maven установить junit-jupiter-engine и junit-jupiter-api (выяснить почему именно эти 2 пакета) с mvnrepository. Покрыть функционал проекта тестами.