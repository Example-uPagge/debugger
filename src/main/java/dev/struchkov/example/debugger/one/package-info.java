/**
 * <p>Первый пакет, который вводит в общую суть дебага</p>
 * <p></p>
 * <p>Пример строится на исключении ConcurrentModificationException при попытке удаления сщуности из Map во время ее обхода.</p>
 * <p></p>
 * <h2><b>Что тут можно показать:</b></h2>
 * <ol>
 *     <li>Как поставить брекпойнт. На примере PersonService</li>
 *     <li></li>
 * </ol>
 * <h2>Сценарий</h2>
 * <p>Первым делом просто запускаем ExampleOne. Видим, что происходит исключение. Рассказываем из-за чего оно произошло. И напоминаем что такое stack trace и что по нему можно навигироваться.</p>
 * <p>Далее ставим точку останова в PersonService#deleteAllByLastName. В этот момент мы показываем, как ставиться точка останова.</p>
 */
package dev.struchkov.example.debugger.one;