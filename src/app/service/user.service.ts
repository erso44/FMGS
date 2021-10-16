import {Injectable} from '@angular/core';
import {User} from "../model/User";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  HOST_USER = 'http://localhost:8080/api/user';

  user!: User;

  constructor(private http: HttpClient) {
    this.loadUser().subscribe(value => {
      this.user = value;
    });
  }

  loadUser(): Observable<User> {
    return this.http.get<User>(this.HOST_USER);
  }
}
