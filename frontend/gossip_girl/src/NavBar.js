import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = (props) => {
  return (
    <header>
      <ul>
        <li className="nav-link"> <Link to="/articles"> Articles</Link></li>

      </ul>
    </header>

  )
}

export default NavBar;
