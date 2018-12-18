import React from 'react';
import {Link} from 'react-router-dom';

const Journalist = (props) => {

  return (
    <React.Fragment>
    <Link to = {"/journalists/" + props.journalist.id}>
      {props.journalist.fName} {props.journalist.lName}
    </Link>
    <p>{props.journalist.field}</p>

    <h6>Woohoo your journalist is appearing!</h6>
    </React.Fragment>
  )
}

export default Journalist;
