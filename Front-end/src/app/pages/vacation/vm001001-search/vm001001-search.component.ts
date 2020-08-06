import { Component, OnInit } from '@angular/core';
import { pageOpiton } from 'src/app/common/page-options';
import { Vacation } from '../vacation-entity/vacation';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { DateValidator } from 'src/app/common/validator/date-validator';
import { NgbDateStruct, NgbDateParserFormatter } from '@ng-bootstrap/ng-bootstrap';
import { StringValidator } from 'src/app/common/validator/string-validator';

@Component({
  selector: 'app-vm001001-search',
  templateUrl: './vm001001-search.component.html',
  styleUrls: ['./vm001001-search.component.scss']
})
export class Vm001001SearchComponent implements OnInit {
  // setOfCheckedId = new Set<number>();
  formSearch: FormGroup;
  vacationList: Vacation[] = [
    {
      vacationID: '1',
      employeeId: '0001',
      employeeName: 'n_tu',
      departmentName: 'Dev_EMS',
      departmentId : '1',
      approve: 'nv_a',
      title: 'Nghix oom',
      endDate: '22/8/2020',
      startDate: '21/8/2020',
      status: 'Accept'
    },
    {
      vacationID: '1',
      employeeId: '0001',
      employeeName: 'n_tu',
      departmentName: 'Dev_EMS',
      departmentId : '1',
      approve: 'nv_a',
      title: 'Nghix oom',
      endDate: '22/8/2020',
      startDate: '21/8/2020',
      status: 'Accept'
    },
    {
      vacationID: '1',
      employeeId: '0001',
      employeeName: 'n_tu',
      departmentName: 'Dev_EMS',
      departmentId : '1',
      approve: 'nv_a',
      title: 'Nghix oom',
      endDate: '22/8/2020',
      startDate: '21/8/2020',
      status: 'Accept'
    },
    {
      vacationID: '1',
      employeeId: '0001',
      employeeName: 'n_tu',
      departmentName: 'Dev_EMS',
      departmentId : '1',
      approve: 'nv_a',
      title: 'Nghix oom',
      endDate: '22/8/2020',
      startDate: '21/8/2020',
      status: 'Accept'
    }
  ];
  public isCollapsed = false;
  pageOpiton = pageOpiton;
  page = 1;
  pageSize = 30;
  pageNum = 1;
  // pageNumDefault = 1;
  totalRecord = 30;
  // Có nên xoay trang khi maxSize> số trang.
  rotate: boolean;
  // Số lượng trang tối đa để hiển thị.
  maxSize = 3;
  submitted: boolean;
  constructor(
    private fb: FormBuilder,
    public formatter: NgbDateParserFormatter

  ) {
    this.formSearch = this.fb.group({
      departmentName: ['', Validators.maxLength(25)],
      startDate : [null, []],
      endDate: [null, []],
      employeeId: [''],
      employeeName: [''],
      status: [''],
    });
  }
  get f() { return this.formSearch.controls; }

  ngOnInit(): void {
    this.submitted = false;
  }
  submitForm(formValue: any) {
    this.submitted = true;
    if (!this.formSearch.invalid) {
      console.log( 'formValue valid', formValue);
     } else {console.log( 'formValue invalid', formValue);
    }

  }
  deleteVacation() {

  }
  changePageSize(pageSize: number) {

  }
  pageChangeOutput(currentPage: any) {

  }
  // onItemChecked(id : number,event){
  //   this.updateCheckedSet(id, event.target.checked);
  // }

  // updateCheckedSet(id: number, checked: boolean): void {
  //   console.log("ID -> ", id,"-> checked", checked)
  //     if (checked) {
  //       this.setOfCheckedId.add(id);
  //     } else {
  //       this.setOfCheckedId.delete(id);
  //     }
  // }
}
