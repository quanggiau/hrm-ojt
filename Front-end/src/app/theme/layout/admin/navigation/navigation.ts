import { Injectable } from '@angular/core';

export interface NavigationItem {
  id: string;
  title: string;
  type: 'item' | 'collapse' | 'group';
  translate?: string;
  icon?: string;
  hidden?: boolean;
  url?: string;
  classes?: string;
  exactMatch?: boolean;
  external?: boolean;
  target?: boolean;
  breadcrumbs?: boolean;
  function?: any;
  badge?: {
    title?: string;
    type?: string;
  };
  children?: Navigation[];
}

export interface Navigation extends NavigationItem {
  children?: NavigationItem[];
}

const NavigationItems = [

  {
    id: 'master',
    title: 'master',
    type: 'group',
    icon: 'feather icon-layers',
    children: [
      {
        id: 'Department',
        title: 'Department',
        type: 'collapse',
        icon: 'feather icon-layout',
        children: [
          {
            id: 'DepartmentList',
            title: 'List',
            type: 'item',
            url: '/department',
            target: false,
          },
          {
            id: 'DepartmentDetail',
            title: 'Create',
            type: 'item',
            url: '/department/create',
            target: false
          }
        ]
      },
      {
        id: 'Skill',
        title: 'Skill',
        type: 'collapse',
        icon: 'feather icon-layout',
        children: [
          {
            id: 'SkillList',
            title: 'List',
            type: 'item',
            url: '/skill',
            target: false,
          },
          {
            id: 'SkillDetail',
            title: 'Create',
            type: 'item',
            url: '/skill/create',
            target: false
          }
        ]
      },
    ]
  }
];

@Injectable()
export class NavigationItem {
  public get() {
    return NavigationItems;
  }
}
