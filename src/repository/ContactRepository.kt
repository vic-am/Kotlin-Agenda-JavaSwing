package repository

import entity.ContactEntity

class ContactRepository {

    companion object {
        private val contactList = mutableListOf<ContactEntity>()

        fun save(contact: ContactEntity) {
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity) {
            var index = 0
            for (c in contactList.withIndex())
                if (c.value.name == contact.name && c.value.phone == contact.phone)
                    index = c.index

            contactList.removeAt(index)

        }

        fun getContactList(): List<ContactEntity> {
            return contactList
        }
    }
}