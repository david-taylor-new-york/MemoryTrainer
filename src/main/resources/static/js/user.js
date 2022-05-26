export default class User {
    #id;
    #userName;
    #pwd;
    constructor(id, userName, pwd) {
        this.#id = id;
        this.#userName = userName;
        this.#pwd = pwd;
        this._id = id;
        this._userName = userName;
        this._pwd = pwd;
    }

    get id() {
        return this._id;
    }

    set id(value) {
        this._id = value;
    }

    get userName() {
        return this._userName;
    }

    set userName(value) {
        this._userName = value;
    }

    get pwd() {
        return this._pwd;
    }

    set pwd(value) {
        this._pwd = value;
    }

    //
    // save() {
    //     return new Promise((resolve, reject) => {
    //         resolve();
    //     })
    // }

    // getUsers() {
    //     User.list((success, users) => {
    //         if (!success) {
    //             console.error(response);
    //         }
    //     })
    // }
}