package codein.hackaton.heart.models

class Make {
    var nickname: String = ""
    var pic: String = ""
    var description: String = ""
    var price: String = ""
    var title:String = ""

    constructor(nickname: String, pic: String, description: String, price: String,title:String) {
        this.nickname = nickname
        this.pic = pic
        this.description = description
        this.price = price
        this.title = title
    }

    constructor() {

    }

}