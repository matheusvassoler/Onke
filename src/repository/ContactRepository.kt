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

        //List é uma lista que aceita valores de diversos tipos
        //Porém só pode ser lida, isto é, não é possivel adicioanr elementos
        //Já a mutableList também é uma lista que aceita diversos valores
        //Porém é possivel ler e adicionar valores
        //Repare que contactList é do tipo MutableList, porém na função retorna List
        //Isso pode ser feito, pois a lista nesse caso está só sendo retornada com os valores
        //Não sendo feito nenhuma adição de valores
        fun getList(): List<ContactEntity> {
            return contactList
        }
    }
}