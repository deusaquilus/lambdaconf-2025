package io.exoquery.example

import io.exoquery.*
import io.exoquery.annotation.CapturedFunction

fun fullJoin() {
  val query = capture.select {
    val p = from(Table<Person>())
    val a = from(Table<Address>())
    where { p.id == a.ownerId }
    Pair(p, a)
  }

  query.buildFor.Postgres()
}

fun main() {
  fullJoin()
}
