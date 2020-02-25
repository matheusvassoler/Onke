package repository

import entity.ContactEntity

class ContactRepository {

    //Permite manter os elementos mesmo após várias chamadas
    companion object {
        //cria uma lista que permite adicionar e remover elementos
        private val contactList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity) {

        }
    }
}